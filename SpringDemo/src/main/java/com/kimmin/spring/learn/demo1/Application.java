package com.kimmin.spring.learn.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by min.jin on 2016/2/17.
 */


@Configuration
@ComponentScan

public class Application {

    @Bean
    MessageService mockMessageService(){
        return new MessageService() {
            public String getMessage() {
                return "HELLO WORLD!";
            }
        };
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }

}
