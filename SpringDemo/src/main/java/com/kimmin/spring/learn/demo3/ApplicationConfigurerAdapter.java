package com.kimmin.spring.learn.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by min.jin on 2016/2/18.
 */

//@Configuration
//@EnableWebMvc
//public class ApplicationConfigurerAdapter extends WebMvcConfigurerAdapter{
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
//        configurer.enable();
//    }
//
//    @Bean
//    public UrlBasedViewResolver viewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/");
//        resolver.setSuffix(".html");
//        return resolver;
//    }
//
//}
