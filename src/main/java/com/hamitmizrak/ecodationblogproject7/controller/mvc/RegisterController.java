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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
                    .name("adi " + i)
                    .surname("surname " + i)
                    .password("password " + i)
                    .email("email" + i + "@gmail.com")
                    .telephone("+90111222334455")
                    .hescode(UUID.randomUUID().toString())
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
    //http://localhost:4444/save/register
    @GetMapping("save/register")
    public String createGet(Model model) {
        model.addAttribute("register_key", new RegisterDto());
        return "register_create";
    }

    //http://localhost:4444/save/register
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
    //http://localhost:4444/find/register
    //http://localhost:4444/find/register/1
    @GetMapping({"find/register","find/register/{id}"})
    public String getFindRegister(@PathVariable("id") Long id,Model model){
        Optional<RegisterEntity> findEntity= iRegisterRepository.findById(id);
        if(findEntity.isPresent()){
            model.addAttribute("find_key",findEntity.get());
            return "register_detail";
        }else{
            model.addAttribute("find_key",id+" nolu veri bulunamadı");
        }
        return "redirect:/list/register";
    }

    //DELETE
    //http://localhost:4444/delete/register
    //http://localhost:4444/delete/register/1
    @GetMapping({"delete/register","delete/register/{id}"})
    public String getDeleteRegister(@PathVariable("id") Long id,Model model){
        Optional<RegisterEntity> findEntity= iRegisterRepository.findById(id);
        if(findEntity.isPresent()){
            model.addAttribute("delete_key",findEntity.get());
            iRegisterRepository.deleteById(id);
        }else{
            model.addAttribute("delete_key",id+" nolu veri bulunamadı");
        }
        return "redirect:/list/register";
    }

    //UPDATE

}
