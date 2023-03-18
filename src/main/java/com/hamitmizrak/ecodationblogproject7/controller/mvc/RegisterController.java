package com.hamitmizrak.ecodationblogproject7.controller.mvc;


import com.hamitmizrak.ecodationblogproject7.data.entity.RegisterEntity;
import com.hamitmizrak.ecodationblogproject7.data.repository.IRegisterRepository;
import com.hamitmizrak.ecodationblogproject7.dto.RegisterDto;
import com.hamitmizrak.ecodationblogproject7.bean.ModelMapperBean;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

//Lombok
@RequiredArgsConstructor
@Log4j2

//controller
@Controller
//@RequestMapping("register")
public class RegisterController {

    //Injection
    private final IRegisterRepository iRegisterRepository;
    private final ModelMapperBean modelMapperBean;

    //Speed
    //http://localhost:4444/speed
    @GetMapping("speed")
    public String createSpeed(Model model) {
        for (int i = 1; i <= 5; i++) {
            RegisterEntity registerEntity = RegisterEntity.builder()
                    .name("adi " + i).surname("surname " + i).password("password " + i).email("email" + i + "@gmail.com").telephone("+90111222334455")
                    .build();
            iRegisterRepository.save(registerEntity);
        }
        return "redirect:/list/register";
    }

    //LIST
    //http://localhost:4444/list/register
    @GetMapping("list/register")
    public String getAllDataList(Model model) {
        List<RegisterEntity> productEntityList = iRegisterRepository.findAll();
        model.addAttribute("register_list", productEntityList);
        return "register_list";
    }

    //CREATE
    //http://localhost:8080/save/register
    @GetMapping("save/register")
    public String createGet(Model model) {
        model.addAttribute("register_key", new RegisterDto());
        return "register_create";
    }

    //http://localhost:8080/save/register
    @PostMapping("save/register")
    //@Transactional//Veri güvenliğini ve veri tutarlılığı için
    public String createPost(@Valid @ModelAttribute("register_key") RegisterDto productDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.hasErrors());
            return "register_create";
        }
        RegisterEntity productEntity = modelMapperBean.modelMapperMethod().map(productDto, RegisterEntity.class);
        iRegisterRepository.save(productEntity);
        return "redirect:/list/register";
    }



    //FIND

    //DELETE

    //UPDATE

}
