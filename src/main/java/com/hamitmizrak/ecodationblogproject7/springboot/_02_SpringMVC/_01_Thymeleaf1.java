package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;

import com.hamitmizrak.ecodationblogproject7.springboot.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    // http://localhost:4444/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2(){
        return "thmeleaf2";
    }


    // http://localhost:4444/thymeleaf3
    //String
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3(Model model){//javadan html göndermek için
        model.addAttribute("ozelanahtar3","Ben javadan geldim");
        return "thmeleaf3";
    }



    // http://localhost:4444/thymeleaf4
    //OBJECT
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4(Model model){//javadan html göndermek için
        Admin  admin=new Admin(1L,"adi","soyadi");
        model.addAttribute("ozelanahtar4",admin);
        return "thmeleaf4";
    }

    // http://localhost:4444/thymeleaf5
    //OBJECT LIST FOR IF
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5(Model model){//javadan html göndermek için
        List<Admin> adminList=new ArrayList<>();
        for (long i = 1; i <=10 ; i++) {
            //Long id, String adminName, String adminSurname, String hescode
            Admin  admin=new Admin(i,"adi"+i,"soyadi"+i,UUID.randomUUID().toString(),i*10);
            adminList.add(admin);
        }
        model.addAttribute("ozelanahtar5",adminList);
        return "thmeleaf5";
    }

}
