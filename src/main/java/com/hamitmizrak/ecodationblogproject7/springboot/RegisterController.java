package com.hamitmizrak.ecodationblogproject7.springboot;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


//Lombok
@RequiredArgsConstructor
@Log4j2

//controller
@Controller
//@RequestMapping("register")
public class RegisterController  {

    //Speed
    //http://localhost:4444/speed
    @GetMapping("speed")
    public String createSpeed(Model model) {
        for (int i = 1; i <= 5; i++) {

        }
        return "redirect:/list/register";
    }

    //LIST


    //CREATE
    //http://localhost:4444/save/register
    @GetMapping("save/register")
    public String createGet(Model model) {
        model.addAttribute("register_key", new RegisterDto());
        return "register_create";
    }

    //http://localhost:4444/save/register
    @PostMapping("save/register")
    //@Transactional//Veri güvenliğini ve veri tutarlılığı için
    public String createPost(@Valid @ModelAttribute("register_key") RegisterDto registerDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.hasErrors());
            return "register_create";
        }
        System.out.println(registerDto);
        return "redirect:/register_list";
    }
}
