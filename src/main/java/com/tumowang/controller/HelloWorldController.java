package com.tumowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by LL on 2018/1/1.
 */
@Controller
@RequestMapping("/Hello")
public class HelloWorldController {
    @RequestMapping("/Sayhi")
    @ResponseBody
    public String SayHi(Model model) {
        model.addAttribute("message", "Hello Spring MVC!");
        System.out.println("===========================================================================================");

        ModelAndView mav = new ModelAndView();
        mav.addObject("sayhi");
        return "sayhi";
    }
}