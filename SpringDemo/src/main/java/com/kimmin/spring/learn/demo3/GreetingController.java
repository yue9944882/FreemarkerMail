package com.kimmin.spring.learn.demo3;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by min.jin on 2016/2/18.
 */



@Controller
public class GreetingController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World")String name,Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

}
