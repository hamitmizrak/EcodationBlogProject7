package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;
import com.hamitmizrak.ecodationblogproject7.springboot.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
public class admin {

    //HIZLI EKLE 27 04

    //BÜTÜN VERI SİL

    //CREATE

    // LIST
    // http://localhost:4444/admin
    @GetMapping("/admin")
    public String getAdmin(Model model){//javadan html göndermek için
        List<AdminDto> adminDtoList =new ArrayList<>();
        for (long i = 1; i <=25 ; i++) {
            //Long id, String adminName, String adminSurname, String hescode
            Random random=new Random();
            boolean isActive= random.nextBoolean();
            //  String hescode, double price, String isActive
            //Long id, String adminName, String adminSurname, String adminEmail, String adminPassword, String hescode, double price, String isActive
            AdminDto adminDto =new AdminDto(i,"adi"+i,"soyadi"+i,"email@"+i,UUID.randomUUID().toString(),"hescode"+i, 100*i, String.valueOf(isActive));
            adminDtoList.add(adminDto);
        }
        model.addAttribute("admin_key", adminDtoList);
        return "admin";
    }

    //UPDATE
    //DELETE
}
