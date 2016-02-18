package com.kimmin.mail.mvc.controller;

import com.kimmin.mail.mvc.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by min.jin on 2016/2/18.
 */


@Controller
public class MainController {

    @Autowired
    SendMailService mailService;

    @RequestMapping(value = "/mail")
    public ModelAndView mailTrigger(){

        /** Calling API via Mail Service **/

        mailService.sendMail("min.jin@ctrip.com");

        return new ModelAndView("ResponsePage.html");
    }



}
