package com.apr_spring_boot.Service;


import com.apr_spring_boot.Controller.CustomerController;
import com.apr_spring_boot.Model.CustomerModel;
import com.apr_spring_boot.Model.MongoDb.UserModelMongo;
import com.apr_spring_boot.Repo.CustomerRepo;
import com.apr_spring_boot.Repo.UserModelMongoRepo;
import com.apr_spring_boot.Request.CustomerReq;
import com.apr_spring_boot.Response.CustomerResponse;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    Environment env;

    @Autowired
    UserModelMongoRepo userModelMongoRepo;
    @Autowired
    CustomerRepo customerRepo;

    private static final Logger logger = LogManager.getLogger(CustomerService.class);

    @Autowired
    EmbeddedCacheManager cacheManager;

    public void storeInCache(){
        cacheManager.getCache("local-cache").put("user_token","asdfjasdfjsadf");
    }
    public String getInCache(){
        return cacheManager.getCache("local-cache").get("user_token").toString();
    }


    public void storeUser(CustomerReq req){
        //TODO :: check email is exist or not.
        /*
            write the query in repo to check the email is exist
            if exist throw the error as user is exist.
            else do the register process.
         */
        //binding the value to model from the request pojo class
        CustomerModel model  = new CustomerModel();
        model.setName(req.getName());
        model.setEmail(req.getEmail());
        model.setPassword(req.getPassword());
        customerRepo.save(model);//store the data in customer-table using CustomerModel Obj
    }

    public boolean tokenValidation(String customerno,String token)throws  Exception{
        try {
            logger.debug("this is token validation");
            Claims claims = Jwts.parser()
                    .setSigningKey(env.getProperty("SECRET_KEY"))//read the value from the application prop file.
                    .parseClaimsJws(token)
                    .getBody();
            Integer cust_no_int  = Integer.parseInt(customerno);//convert str to int;
          if(cacheManager.getCache("local-cache").get("token_"+customerno) != null){
              String tokenCache = cacheManager.getCache("local-cache").get("token_"+customerno).toString();
              //get the token from cache
              if(tokenCache != null){
                  if(token.equals(tokenCache)){
                      System.out.println("token is validated and matched from the cache..");
                      return true;
                  }
                  System.out.println("token is not matched.");
              }
          }else{
              String tokenDb = customerRepo.getTokenByUserId(cust_no_int);
              System.out.println("token is validated from database");
              if(tokenDb.equals(token)){
                  System.out.println("token is updated in the cache");
                  cacheManager.getCache("local-cache").put("token_"+customerno,tokenDb);//store the token in cache.
                  return true;
              }
              System.out.println("token is not matched.");
              //if token is not exist in the cache..need to test from db
              //customerRepo.tokenValidation(cust_no_int,token).orElseThrow(()->new Exception("Token is not validated"));
          }
            throw new Exception("token is not matched");
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
            throw new Exception("Error while parsing token or token expired");
           // throw new Exception("Error :: token");
        }
    }
    public CustomerResponse userLogin(CustomerReq req)throws  Exception{
        try{
            logger.debug("this is debug message");
            logger.info("User is login..");
            Optional<CustomerModel> customerOpt = customerRepo.login(req.getEmail(),req.getPassword());
            if(customerOpt.isPresent()){
                logger.info("User is present..");
                CustomerModel customerModel =   customerOpt.get();
                String token = doGenerateToken(customerModel.getEmail());
                // String token = getTOken(customerModel.getEmail());
                CustomerResponse res = new CustomerResponse();
                res.setCustomer_no(customerModel.getCustomer_no());
                res.setName(customerModel.getName());
                res.setAddress(customerModel.getAddress());
                res.setToken(token);
                logger.info("update the token ..");
                updateToken(customerModel.getCustomer_no(),token);//update the token
                //before sending the response store the token against the customer.
                return res;
            }else{
                logger.error("user is not exist. ..");
                throw new Exception("User is not exist");
            }
        }catch (Exception e){
            logger.error("this is login..");
            e.printStackTrace();
            throw e;
        }
            //email and password from customer table.

    }
    public void logout(int customerId){
        this.updateToken(customerId,"");//token is empty for logout api
    }
    private String doGenerateToken(String subject)throws Exception {
        try{
            //The JWT signature algorithm we will be using to sign the token

            long nowMillis = System.currentTimeMillis();
            Date now = new Date(nowMillis);
            long ttlMillis = 60*60*1000;//1hour token
           // long ttlMillis = 5*1000;//5secs token
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);

            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(env.getProperty("SECRET_KEY"));//read the value from the application prop file.

            //Let's set the JWT Claims
            JwtBuilder builder = Jwts.builder()
                    .setIssuedAt(now)
                    .setSubject(subject)
                    .signWith(SignatureAlgorithm.HS256, apiKeySecretBytes)
                    .setExpiration(exp);
                //Builds the JWT and serializes it to a compact, URL-safe string
            return builder.compact();//create jwt token
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    private void updateToken(int customerId,String token){
        cacheManager.getCache("local-cache").put("token_"+customerId,token);//store the token in cache.
        customerRepo.tokenUpdate(customerId,token);//update the token after login success
    }
    private String getTOken(String email){
        long time = System.currentTimeMillis();
        String key = email+time;
        return Base64.getEncoder().encode(key.getBytes()).toString();
    }

    public List<CustomerModel> getCustomers(){
            return customerRepo.findAll();// get all the customers from the customer table.
    }

    public CustomerModel getCustomerById(Integer id)throws Exception{
        CustomerModel customerModel = null;
        if(cacheManager.getCache("local-cache").get("detail_"+id) == null){
            //if cache does not have the data
             customerModel =  customerRepo.findById(id).orElseThrow(()->new Exception("Customer is not exist"));//get the customer by id;
            cacheManager.getCache("local-cache").put("detail_"+id,customerModel);
        }else{
            //cache has the data.
            customerModel = (CustomerModel) cacheManager.getCache("local-cache").get("detail_"+id);
        }
        return customerModel;
    }

    public boolean customerDelete(Integer id)throws  Exception{
        CustomerModel customerModel = getCustomerById(id);
        customerRepo.delete(customerModel);//delete the customer
        return true;
    }


    public boolean passwordUpdate(CustomerReq req)throws  Exception{
        //email and password from customer table.
        Optional<CustomerModel> customerOpt = customerRepo.findById(req.getCustomerId());//get the customer by id;
        if(customerOpt.isPresent()){
           CustomerModel customerModel = customerOpt.get();//only if data is exist.
            customerModel.setPassword(req.getPassword());//assign the password to modelclass.
            customerRepo.save(customerModel);//update the data.
            return true;
        }else{
            throw new Exception("User is not exist");
        }
    }
    public boolean passwordUpdate2(CustomerReq req)throws  Exception{
        //email and password from customer table.
        Optional<CustomerModel> customerOpt = customerRepo.findById(req.getCustomerId());//get the customer by id;
        if(customerOpt.isPresent()){
           customerRepo.passwordUpdate(req.getCustomerId(), req.getPassword());//calling the repo method
            return true;
        }else{
            throw new Exception("User is not exist");
        }
    }

    public List<UserModelMongo> getUsersFromMongodb(){
        return userModelMongoRepo.findAll();//get all data from the mongodb may_Mongo->user collection.
    }
    public boolean deleteFromMongodb(String id){
        userModelMongoRepo.deleteById(id);
        return true;
    }
    public boolean getUserById(String id){
        userModelMongoRepo.findById(id);//get the user by id.
        return true;
    }
    public boolean insertUserInMongo(CustomerReq req){
        try{
            UserModelMongo userModelMongo = new UserModelMongo();
            userModelMongo.setAddress(req.getAddress());
            userModelMongo.setPincode(req.getPincode());
            userModelMongo.setName(req.getName());
            userModelMongo.setEmail(req.getEmail());
            userModelMongoRepo.save(userModelMongo);//store the data in mongodb
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

}
