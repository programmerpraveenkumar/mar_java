package com.apr_spring_boot.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//localhost:8080/admin/login
//localhost:8080/admin/register
@RestController
@RequestMapping("admin")
public class AdminController {
    @PostMapping("register")
    public void adminRegister(){

    }
    @PostMapping("login")
    public void adminLogin(){

    }
}
