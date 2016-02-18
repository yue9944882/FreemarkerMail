package com.kimmin.mail.mvc.service;

import org.springframework.stereotype.Service;

/**
 * Created by min.jin on 2016/2/18.
 */


@Service
public class SendMailServiceImpl implements SendMailService{

    public boolean sendMail(String addr){
        /** Invoking FreeMarker to Generate a Mail-Doc **/

        System.out.println("[TEST]:\tMail Sending..");

        return true;
    }
}
