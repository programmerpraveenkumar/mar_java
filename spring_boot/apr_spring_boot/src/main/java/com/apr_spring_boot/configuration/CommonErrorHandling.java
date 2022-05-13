package com.apr_spring_boot.configuration;

import com.apr_spring_boot.Response.SampleRes;
import com.apr_spring_boot.Service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.xml.ws.Response;


/*
Common Error handling for entire application.
 */
@ControllerAdvice
public class CommonErrorHandling {
    private static final Logger logger = LogManager.getLogger(CommonErrorHandling.class);
    //all exception  will be caught here.
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> getError(Exception e){
        logger.error("this is smaple error ",e);
        SampleRes res = new SampleRes();
        System.out.println("controller advice "+e.getMessage());
        res.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(res);//send the error response to the client
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> getErrorCustomException(Exception e){
        logger.error("this is getErrorCustomException error ",e);
        SampleRes res = new SampleRes();
        System.out.println("controller advice "+e.getMessage());
        res.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(res);
    }
}
