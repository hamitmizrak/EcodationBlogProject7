package com.hamitmizrak.ecodationblogproject7.springboot._02_SpringMVC;
import com.hamitmizrak.ecodationblogproject7.springboot.AdminDto;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
@Log4j2
public class AdminController {

    //HIZLI EKLE

    //BÜTÜN VERI SİL

    // CREATE
    // http://localhost:4444/validation/form
    // GET
    @GetMapping("/validation/form")
    public String validationGetForm(Model model){
       model.addAttribute("admin_validation",new AdminDto());
       return "admin_create";
    }

    // POST
    // http://localhost:4444/validation/form
    @PostMapping("/validation/form")
    public String validationPostForm(@Valid @ModelAttribute("admin_validation") AdminDto adminDto,
                                     BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            log.error("hata var: "+bindingResult);
            model.addAttribute("admin_validation",new AdminDto());
            return "admin_create";
        }
        model.addAttribute("admin_success","Ekleme başarılı...");
        return "admin_create";
    }


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
