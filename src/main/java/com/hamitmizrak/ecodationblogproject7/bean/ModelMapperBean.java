package com.hamitmizrak.ecodationblogproject7.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean {

    @Bean
    public ModelMapper modelMapperMethod(){
        return new ModelMapper();
    }

}
