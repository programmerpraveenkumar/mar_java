package com.apr_spring_boot.Controller;

import com.apr_spring_boot.Request.CustomerReq;
import com.apr_spring_boot.Response.SampleRes;
import com.apr_spring_boot.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//localhost:8080/customer/login
//localhost:8080/customer/register
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @PostMapping("register")
    public ResponseEntity customerRegister(@RequestBody CustomerReq req){
        SampleRes res = new SampleRes();
        try{
            if(req.getPassword() == null ||req.getPassword().equals("")){
                throw new Exception("Password should not be empty");
            }
            customerService.storeUser(req);
            res.setMessage("User Register Successful");//set the string in setter
        }catch (Exception e){
            res.setMessage("Error :"+e.getMessage());//set the string in setter
            return ResponseEntity.badRequest().body(res);
        }
        return ResponseEntity.ok(res);//sending the pojo  class as the respnose
    }
    @PostMapping("login")
    public ResponseEntity<?> customerLogin(@RequestBody CustomerReq req){
        SampleRes res = new SampleRes();
        try{
            if(req.getEmail() == null ||req.getEmail().equals("")){
                throw new Exception("Email should not be empty");
            }
            if(req.getPassword() == null ||req.getPassword().equals("")){
                throw new Exception("Password should not be empty");
            }
            customerService.userLogin(req);
            res.setMessage("User is exist");//set the string in setter
            return ResponseEntity.ok(res);//sending the pojo  class as the respnose
        }catch (Exception e){
            res.setMessage("Error :"+e.getMessage());//set the string in setter
            return ResponseEntity.badRequest().body(res);
        }
        //call the login method from the customerservice

    }
}
