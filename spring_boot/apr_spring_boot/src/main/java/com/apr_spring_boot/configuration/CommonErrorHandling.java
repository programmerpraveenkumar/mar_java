package com.apr_spring_boot.configuration;

import com.apr_spring_boot.Response.SampleRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.xml.ws.Response;


/*
Common Error handling for entire application.
 */
@ControllerAdvice
public class CommonErrorHandling {
    //all exception  will be caught here.
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> getError(Exception e){
        SampleRes res = new SampleRes();
        System.out.println("controller advice "+e.getMessage());
        res.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(res);//send the error response to the client
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> getErrorCustomException(Exception e){
        SampleRes res = new SampleRes();
        System.out.println("controller advice "+e.getMessage());
        res.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(res);
    }
}
