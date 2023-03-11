package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _01_Thymeleaf1 {


    // http://localhost:4444/thymeleaf0
    @GetMapping("/thymeleaf0")
    @ResponseBody
    public String getThymeleaf0(){
        return "Merhabalar ben htmlsiz görüntüyüm";
    }
}
