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
public class admin {

    // MODEL
    // http://localhost:4444/admin
    //OBJECT LIST FOR IF
    @GetMapping("/admin")
    public String getAdmin(Model model){//javadan html göndermek için
        List<AdminDto> adminDtoList =new ArrayList<>();
        for (long i = 1; i <=25 ; i++) {
            //Long id, String adminName, String adminSurname, String hescode
            Random random=new Random();
            boolean isActive= random.nextBoolean();
            AdminDto adminDto =new AdminDto(i,"adi"+i,"soyadi"+i,UUID.randomUUID().toString(),i*10,String.valueOf(isActive));
            adminDtoList.add(adminDto);
        }
        model.addAttribute("admin_key", adminDtoList);
        return "admin";
    }
}
