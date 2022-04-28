package com.apr_spring_boot.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//return the html webpages
@RequestMapping("web")
public class Web {

    @GetMapping("home")
    public ModelAndView getHomePage(){
        System.out.println("get home page ");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home1.html");//html page
        return modelAndView;//return the model and view
    }
    @GetMapping("home1")
    public String getHomePage1(){
//        System.out.println("get home page ");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("home1.html");//html page
//        return modelAndView;//return the model and view
        return "home1.html";
    }
}
