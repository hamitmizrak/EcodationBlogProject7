package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _01_Thymeleaf1 {

    // http://localhost:4444/thymeleaf0
    @GetMapping("/thymeleaf0")// @get: url çağırma
    @ResponseBody//Bir html sayfası olmadan direk göstersin
    public String getThymeleaf0(){
        return "Merhabalar ben htmlsiz görüntüyüm";
    }

    // http://localhost:4444/thymeleaf1
    @GetMapping("/thymeleaf1")
    public String getThymeleaf1(){
        return "thmeleaf1"; //html sayfasına gidiyor
    }
}
