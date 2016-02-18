package com.kimmin.mail.mvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.internet.MimeMessage;

import freemarker.template.Template;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by min.jin on 2016/2/18.
 */


@Service
public class SendMailServiceImpl implements SendMailService{

    @Autowired
    FreeMarkerConfigurer configurer;

    private static String departureAddr = null;
    private static String departurePasswd = null;
    private static String smtpHostAddr = null;



    public SendMailServiceImpl(){
        departureAddr = "ctripmailbot@126.com";
        departurePasswd = "ctrip123456";
        smtpHostAddr = "smtp.126.com";
    }

    /** Mail-Sending API Entry **/
    public boolean sendMail(String addr){

        /** Invoking FreeMarker to Generate a Mail-Doc **/
        System.out.println("[TEST]:\tHandling Mail Sending Request..");

        /** Make an instance of Java Mail Sender **/
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setProtocol("smtp");
        sender.setHost(smtpHostAddr);
        sender.setUsername(departureAddr);
        sender.setPassword(departurePasswd);

        final String destinationAddr = addr;

        MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {
                /** Specify Message From & To **/
                MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                message.setTo(destinationAddr);
                message.setFrom(departureAddr);

                /** Fake Title .. Need to change dynamically **/
                message.setSubject("[CTRIP MAIL BOT] :THIS IS A AUTOMATIC MAIL, PLEASE DO NOT REPLY!");

                /** Generate a DOM accordingly **/
                Map<String,Object> map = new HashMap<String, Object>();
                map.put("name","Kimmin");

                /** Generate a Complete Doc of Mail via Template Engine **/
                Template template = configurer.getConfiguration().getTemplate("test_mail.ftl");
                final String szMailCtnt = FreeMarkerTemplateUtils.processTemplateIntoString(template,map);
                message.setText(szMailCtnt,true);
            }
        };
        sender.send(preparator);
        return true;
    }


    /** Manually Configuration Entry for Account & Passwd **/
    public void setDepartureMail(String addr, String passwd){
        departureAddr = addr;
        departurePasswd = passwd;
    }

    /** Manually Configuration Entry for SMTP site **/
    public void setSMTPSite(String host){
        smtpHostAddr = host;
    }



}
