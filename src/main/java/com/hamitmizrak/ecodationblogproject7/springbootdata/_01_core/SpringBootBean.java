package com.hamitmizrak.ecodationblogproject7.springbootdata._01_core;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SpringBootBean {

    //SF:Spring Frameowork
    //SF bir parçası olması için @Bean annotaiton yazıyoruz.

    @Bean
    public SpringBeanDto springBeanDto(){
        return SpringBeanDto.builder()
                .id(1L).beanName("bean adı 44")
                .build();
    }

    //parametresiz constructor
    public  SpringBootBean(){
        System.out.println("parametresiz constructor");
    }

    //Constructor
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct constructor ");
    }

    public static void main(String[] args) {
        SpringBootBean  bootBean=new SpringBootBean();
        System.out.println(bootBean);
    }
}
