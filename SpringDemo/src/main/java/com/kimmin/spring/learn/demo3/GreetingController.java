package com.kimmin.spring.learn.demo3;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by min.jin on 2016/2/18.
 */



@Controller
public class GreetingController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView greeting(){
        return new ModelAndView("greeting.html").addObject("name","Kimmin");
    }


}
