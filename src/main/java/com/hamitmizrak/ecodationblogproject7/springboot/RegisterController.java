package com.hamitmizrak.ecodationblogproject7.springboot;


import com.hamitmizrak.ecodationblogproject7.springboot._03_SpringDATA.IRegisterRepository;
import com.hamitmizrak.ecodationblogproject7.springboot._03_SpringDATA.RegisterEntity;
import com.hamitmizrak.ecodationblogproject7.springboot.bean.ModelMapperBean;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.UUID;


//Lombok
@RequiredArgsConstructor
@Log4j2

//controller
@Controller
//@RequestMapping("register")
public class RegisterController {

    //Injection
    private final ModelMapperBean modelMapperBean; //dto to entity
    private final IRegisterRepository iRegisterRepository; //database

    //Speed
    //http://localhost:4444/speed
    @GetMapping("speed")
    public String createSpeed(Model model) {
        for (int i = 1; i <= 5; i++) {
            RegisterDto registerDto = RegisterDto.builder()
                    .name("adi" + i)
                    .surname("soyadı" + i)
                    .email("email" + i + "gmail.com")
                    .password(UUID.randomUUID().toString())
                    .build();
            //Dto'yu entity çevirdik
            RegisterEntity registerEntity=modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
            iRegisterRepository.save(registerEntity);
        }
        return "redirect:/register_list";
    }

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
        //Dto'yu entity çevirdik
        RegisterEntity registerEntity=modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
        iRegisterRepository.save(registerEntity);
        return "redirect:/register_list";
    }
}
