package com.apr_spring_boot.Service;


import com.apr_spring_boot.Model.CustomerModel;
import com.apr_spring_boot.Repo.CustomerRepo;
import com.apr_spring_boot.Request.CustomerReq;
import com.apr_spring_boot.Response.CustomerResponse;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
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
    CustomerRepo customerRepo;

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
            Claims claims = Jwts.parser()
                    .setSigningKey(env.getProperty("SECRET_KEY"))//read the value from the application prop file.
                    .parseClaimsJws(token)
                    .getBody();
            Integer cust_no_int  = Integer.parseInt(customerno);//convert str to int;
            customerRepo.tokenValidation(cust_no_int,token).orElseThrow(()->new Exception("Token is not validated"));
            return true;//if customer is not exist it will throw the error.
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    public CustomerResponse userLogin(CustomerReq req)throws  Exception{
        try{
            Optional<CustomerModel> customerOpt = customerRepo.login(req.getEmail(),req.getPassword());
            if(customerOpt.isPresent()){
                CustomerModel customerModel =   customerOpt.get();
                String token = doGenerateToken(customerModel.getEmail());
                // String token = getTOken(customerModel.getEmail());
                CustomerResponse res = new CustomerResponse();
                res.setCustomer_no(customerModel.getCustomer_no());
                res.setName(customerModel.getName());
                res.setAddress(customerModel.getAddress());
                res.setToken(token);
                updateToken(customerModel.getCustomer_no(),token);//update the token
                //before sending the response store the token against the customer.
                return res;
            }else{
                throw new Exception("User is not exist");
            }
        }catch (Exception e){
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
         return customerRepo.findById(id).orElseThrow(()->new Exception("Customer is not exist"));//get the customer by id;
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

}
