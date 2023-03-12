package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;

import com.hamitmizrak.ecodationblogproject7.springboot.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
        return "thymeleaf1"; //html sayfasına gidiyor
    }

    // http://localhost:4444/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2(){
        return "thymeleaf2";
    }

    // http://localhost:4444/thymeleaf3
    //String
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3(Model model){//javadan html göndermek için
        model.addAttribute("ozelanahtar3","Ben javadan geldim");
        return "thymeleaf3";
    }

    // http://localhost:4444/thymeleaf4
    //OBJECT
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4(Model model){//javadan html göndermek için
        AdminDto adminDto =new AdminDto(1L,"adi","soyadi");
        model.addAttribute("ozelanahtar4", adminDto);
        return "thymeleaf4";
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
        return "thymeleaf5";
    }

///////////////////////////////////////////////////////////////////////////////////
    // PathVariable
    // http://localhost:4444/thymeleaf6/1
    @GetMapping("/thymeleaf6/{id}")
    public String getThymeleaf6(Model model, @PathVariable(name="id") Long id){//javadan html göndermek için
        AdminDto adminDto =new AdminDto(id,"adi","soyadi",UUID.randomUUID().toString(),10,"true");
        model.addAttribute("ozelanahtar6", adminDto);
        return "thymeleaf6";
    }


    // PathVariable multiple
    // http://localhost:4444/thymeleaf7/1/adi
    @GetMapping("/thymeleaf7/{id}/{name}")
    public String getThymeleaf7(Model model,
                                @PathVariable(name="id") Long id,
                                @PathVariable(name="name") String name

    ){//javadan html göndermek için
        AdminDto adminDto =new AdminDto(id,name,"soyadi",UUID.randomUUID().toString(),10,"true");
        model.addAttribute("ozelanahtar7", adminDto);
        return "thymeleaf7";
    }


    // PathVariable Validation
    // http://localhost:4444/thymeleaf8
    // http://localhost:4444/thymeleaf8/0
    // http://localhost:4444/thymeleaf8/1
    @GetMapping({"/thymeleaf8","/thymeleaf8/{id}"})
    public String getThymeleaf8(Model model, @PathVariable(name="id",required = false) Long id){//javadan html göndermek için
        if(id==null){
            model.addAttribute("validation_key", "404 Not Found");
        } else if(id==0){
            model.addAttribute("validation_key", "403 Bad Request");
        }else{
            AdminDto adminDto =new AdminDto(id,"adi","soyadi",UUID.randomUUID().toString(),10,"true");
            model.addAttribute("ozelanahtar8", adminDto);
        }
        return "thymeleaf8";
    }

    // RequestParam
    // http://localhost:4444/thymeleaf9?id=2&name=adi2
    @GetMapping("/thymeleaf9")
    public String getThymeleaf9(Model model,
                                @RequestParam(name="id") Long id,
                                @RequestParam(name="name") String name
    ){
        AdminDto adminDto =new AdminDto(id,name,"soyadi",UUID.randomUUID().toString(),10,"true");
        model.addAttribute("ozelanahtar9", adminDto);
        return "thymeleaf9";
    }


}
