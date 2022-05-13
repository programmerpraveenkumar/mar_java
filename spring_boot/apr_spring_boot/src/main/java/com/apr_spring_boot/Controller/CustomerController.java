package com.apr_spring_boot.Controller;

import com.apr_spring_boot.Request.CustomerReq;
import com.apr_spring_boot.Response.SampleRes;
import com.apr_spring_boot.Service.CustomerService;


import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//localhost:8080/customer/login
//localhost:8080/customer/register
@RestController//send the rest response
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    private static final Logger logger = LogManager.getLogger(CustomerController.class);

    @GetMapping("getCustomer")
    public ResponseEntity<?> getCustomers(){
        return ResponseEntity.ok(customerService.getCustomers());//get all the customer
    }
    @GetMapping("getUsersFromMongo")
    public ResponseEntity<?> getUsersFromMongo(){
        return ResponseEntity.ok(customerService.getUsersFromMongodb());
    }
    @PostMapping("insertUserInMongo")
    public ResponseEntity<?> insertUserInMongo(@RequestBody CustomerReq req){
        customerService.insertUserInMongo(req);
        return ResponseEntity.ok("inserted success");

    }
    @PostMapping("deleteByIdUserInMongo")
    public ResponseEntity<?> deleteByIdUserInMongo(@RequestBody CustomerReq req) {
        customerService.deleteFromMongodb(req.getId());//delete
        return ResponseEntity.ok("inserted success");
    }



        @GetMapping(value = "file_download/{fileName}",produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[]  file_download(@PathVariable String  fileName){

        try{
            String folderName = "/Volumes/softwares/upload_folder/apr-26/"+fileName;//mapping file in the folder.
            InputStream in = new FileInputStream(folderName);//reading the image from the location.
            return IOUtils.toByteArray(in);//return the bytes
        }catch (Exception e){
            e.printStackTrace();//;print the error.
            return null;
        }
    }


    @PostMapping("file_upload")
    public ResponseEntity<?> file_upload(@RequestParam MultipartFile file){
        SampleRes res = new SampleRes();
        try{
            byte[] bytes = file.getBytes();
            String folderName = "/Volumes/softwares/upload_folder/apr-26/";//folder to store.
            System.out.println(file.getOriginalFilename()+" "+file.getContentType());
            //using the file name can validate the file for restriction..
            Path path = Paths.get(folderName + file.getOriginalFilename());
            Files.write(path,bytes);//write teh file in the location
            //file.getSize()->restrict the file size
            res.setMessage("file upload success");
            return ResponseEntity.ok(res);
        }catch (Exception e){
            res.setMessage("file upload failure");
            return ResponseEntity.badRequest().body(res);
        }
    }

    @PostMapping("register")
    public ResponseEntity<?> customerRegister(@RequestBody CustomerReq req)throws Exception{
        SampleRes res = new SampleRes();

            if(req.getPassword() == null ||req.getPassword().equals("")){
                throw new Exception("Password should not be empty");
            }
            customerService.storeUser(req);
            res.setMessage("User Register Successful");//set the string in setter
        return ResponseEntity.ok(res);//sending the pojo  class as the respnose
    }
    @PostMapping("login")
    public ResponseEntity<?> customerLogin(@RequestBody CustomerReq req)throws Exception{
        SampleRes res = new SampleRes();
        logger.info("this is login..");
            if(req.getEmail() == null ||req.getEmail().equals("")){
                throw new Exception("Email should not be empty");
            }
            if(req.getPassword() == null ||req.getPassword().equals("")){
                throw new Exception("Password should not be empty");
            }
            return ResponseEntity.ok(customerService.userLogin(req));

        //call the login method from the customerservice

    }
    @PostMapping("passwordUpdate")
    public ResponseEntity<?> passwordUpdate(@RequestBody CustomerReq req)throws Exception{
            SampleRes res = new SampleRes();
            if(req.getPassword() == null ||req.getPassword().equals("")){
                throw new Exception("Password should not be empty");
            }
            customerService.passwordUpdate(req);
            res.setMessage("Password is update successfully!!");//set the string in setter
            return ResponseEntity.ok(res);//sending the pojo  class as the respnose

        //call the login method from the customerservice
    }
    @PostMapping("logout")
    public ResponseEntity<?> userLogout(@RequestHeader String user_id)throws Exception{
        SampleRes res = new SampleRes();
        int user_id_int = Integer.parseInt(user_id);
        customerService.logout(user_id_int);
        res.setMessage("Logout is successfull!!");//set the string in setter
        return ResponseEntity.ok(res);//sending the pojo  class as the respnose

        //call the login method from the customerservice
    }

}
