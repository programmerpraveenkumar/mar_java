package com.apr_spring_boot.configuration;

import com.apr_spring_boot.Model.CityModel;
import com.apr_spring_boot.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class SampleScheduler {
    @Autowired
    SampleService sample;

//    @Scheduled(fixedDelay = 1000)//ech 1 sec
//    public void printMessaage(){
//        System.out.println("this is fixed delay.."+System.currentTimeMillis());
//    }

    @Scheduled(cron ="* 43 5 * * *")
    public void simpleCronJob(){
        System.out.println("this is 5:43"+System.currentTimeMillis());
    }

    @Scheduled(cron ="0 52 5 * * *")
    public void simpleCronJob1(){
        //calling the database list.
        sample.getCityList().forEach((o)->{
            System.out.println(o.getCity_id()+" "+o.getCityname());
        });
        System.out.println("this is 5:48"+System.currentTimeMillis());
    }
}
