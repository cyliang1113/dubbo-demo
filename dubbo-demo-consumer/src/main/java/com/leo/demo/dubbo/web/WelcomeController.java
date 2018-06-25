package com.leo.demo.dubbo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome! ! !";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}
