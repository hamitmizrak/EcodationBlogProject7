package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;

import com.hamitmizrak.ecodationblogproject7.springboot.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        AdminDto adminDto =new AdminDto(1L,"adi","soyadi");
        model.addAttribute("ozelanahtar4", adminDto);
        return "thmeleaf4";
    }

    //MODEL
    // http://localhost:4444/thymeleaf5
    //OBJECT LIST FOR IF
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5(Model model){//javadan html göndermek için
        List<AdminDto> adminDtoList =new ArrayList<>();
        for (long i = 1; i <=10 ; i++) {
            //Long id, String adminName, String adminSurname, String hescode
            Random random=new Random();
            boolean isActive= random.nextBoolean();
            AdminDto adminDto =new AdminDto(i,"adi"+i,"soyadi"+i,UUID.randomUUID().toString(),i*10,String.valueOf(isActive));
            adminDtoList.add(adminDto);
        }
        model.addAttribute("ozelanahtar5", adminDtoList);
        return "thmeleaf5";
    }
}
