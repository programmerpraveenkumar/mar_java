package com.apr_spring_boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
rest controller will send the text or json response.
it is statless api for process the get and post methods.
 */
@RestController
public class SampleController {


    //get mapping with end point url.
    @GetMapping("test")
    public String sampleGetMethod(@RequestParam String name,@RequestParam String email){
       // return "sample GET response from the spring boot app ";
        return "request param is "+name+" "+email;//dynamic response
    }
    //post mapping with end point url.
    @PostMapping("testpost")
    public String samplePostMethod(@RequestParam String name,@RequestParam String email){
        //return "sample Post response from the spring boot app";
        return "args are "+name+" "+email;
    }

}
