package com.apr_spring_boot.Service;


import com.apr_spring_boot.Model.CustomerModel;
import com.apr_spring_boot.Repo.CustomerRepo;
import com.apr_spring_boot.Request.CustomerReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

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
    public boolean userLogin(CustomerReq req)throws  Exception{

            //email and password from customer table.
           Optional<CustomerModel> customerOpt = customerRepo.login(req.getEmail(),req.getPassword());
           if(customerOpt.isPresent()){
               return true;
           }else{
               throw new Exception("User is not exist");
           }

    }
}
