package com.apr_spring_boot.Service;


import com.apr_spring_boot.Model.CityModel;
import com.apr_spring_boot.Repo.CityRepo;
import com.apr_spring_boot.Response.SampleRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    //inject the repo in the service class
    @Autowired
    CityRepo cityRepo;


    public String getSampleService(){
        return "sample string from the service method";
    }

    public SampleRes  samplePojoClass(){
        SampleRes res = new SampleRes();
        res.setMessage("sample message from the service");//set the string in setter
        res.setStatusCode("100");
       return res;
    }
    //CRUD operation
    //create,read,update,delete


    //findall->getall the data from the table.
    public List<CityModel> getCityList(){
        return cityRepo.findAll();//get all the data from the table.
    }
}
