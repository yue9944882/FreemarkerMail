package com.kimmin.mail.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by min.jin on 2016/2/18.
 */


@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class ApplicationEntry {

    public static void main(String[] args){
        SpringApplication.run(ApplicationEntry.class,args);
    }

}
