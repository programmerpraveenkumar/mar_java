package com.apr_spring_boot.Controller;

import com.apr_spring_boot.Model.CityModel;
import com.apr_spring_boot.Request.SampleReq;
import com.apr_spring_boot.Response.SampleRes;
import com.apr_spring_boot.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/*
rest controller will send the text or json response.
it is statless api for process the get and post methods.
 */
@RestController
public class SampleController {

        @Autowired //DI
        SampleService sampleService;//inject the service class in the controller.

    //get mapping with end point url.
    @GetMapping("test")
    public String sampleGetMethod(@RequestParam String name,@RequestParam String email){
       // return "sample GET response from the spring boot app ";
        //return "request param is "+name+" "+email;//dynamic response
        return sampleService.getSampleService();//send the response from the service class.
    }
    @GetMapping("test1")
    public String sampleGetMethod1(){
         return sampleService.getSampleService();//send the response from the service class.
    }

    @GetMapping("test2")
    public ResponseEntity<?> sampleGetMethod2(){
        SampleRes res = sampleService.samplePojoClass();
        return ResponseEntity.ok(res);//success response
    }
    //post mapping with end point url.
    @PostMapping("testpost")
    public String samplePostMethod(@RequestParam String name,@RequestParam String email){
        //return "sample Post response from the spring boot app";
        return "args are "+name+" "+email;
    }

    /*
            path variable value will be set in the url itself(both get and post can be applicable)
            testpath/test->ok
            testpath/test2->ok
            testpath/anyvalue->ok
            all the above 3 urls can be match with below url method.
     */

    @PostMapping("testpath/{username}")
    public String samplePathVariable(@PathVariable String username){
            return "path variable is "+username;
    }
    /*
        Requestbody
            best to use with postmapping
            can able to recv string or any pojo classes also.
     */

    //requestbody with string
    @PostMapping("req_body")
    public String sampleRequestBody(@RequestBody String name){
        return "sample response body is "+name;
    }

    //requestbody with pojoclass
    @PostMapping("req_body_pojoclass")
    public String sampleRequestBody_pojoclass(@RequestBody SampleReq obj){
        return "sample response body is "+obj.getEmail()+" "+obj.getName();
    }

    @GetMapping("testRes")
    public ResponseEntity<?> sampleGetMethod(){
        SampleRes res = new SampleRes();
        res.setMessage("sample message for the response");//set the string in setter
        res.setStatusCode("100");
        return ResponseEntity.ok(res);//sending the pojo  class as the respnose
    }
    @GetMapping("error_status_code")
    public ResponseEntity<?> error_status_code(){
        SampleRes res = new SampleRes();
        res.setMessage("sample message for the response");
        //ResponseEntity.ok(res) -> success reponse.
        return ResponseEntity.badRequest().body(res);//error status code.failure response
    }

    @GetMapping("getcity")
    public ResponseEntity<?> getCity(){
       List<CityModel> res = sampleService.getCityList();
       return ResponseEntity.ok(res);
    }

}
