package com.apr_spring_boot.WebController;

import com.apr_spring_boot.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller//return the html webpages
@RequestMapping("web")
public class Web {

    @Autowired
    SampleService sampleService;
    @GetMapping("/index2")
    public String showUserList(Model model) {
        model.addAttribute("users", "sample users");
        return "index";
    }
    @GetMapping("about")
    public String getAboutPage(Model model){
        model.addAttribute("pageName","this is about page from java");
        return "about.html";
    }
    @GetMapping("db")
    public String getDbValue(Model model){
        model.addAttribute("cityList",sampleService.getCityList());
        return "db.html";
    }
    @GetMapping("list")
    public String getListPage(Model model){
        List<String> obj  = new ArrayList<String>();
        obj.add("test1");
        obj.add("test2");
        obj.add("test3");
        obj.add("test4");
        obj.add("test5");
        model.addAttribute("pageName","this is List page from java");//this is variable will print in the page.
        model.addAttribute("samplelist",obj);//adding the list and will parse in the html page
        return "list.html";
    }
}
