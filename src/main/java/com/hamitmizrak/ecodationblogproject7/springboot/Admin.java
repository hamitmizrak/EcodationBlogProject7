package com.hamitmizrak.ecodationblogproject7.springboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class Admin {
    private Long id;
    private String adminName;
    private String adminSurname;
    private String hescode;
    private double price;
    private String isActive;
    private Date date=new Date(System.currentTimeMillis());

    //constructor parametreli(overloading)
    public Admin(Long id, String adminName, String adminSurname) {
        this.id = id;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }

    //constructor parametreli(overloading)
    public Admin(Long id, String adminName, String adminSurname, String hescode,double price,String isActive) {
        this.id = id;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
        this.hescode = hescode;
        this.price=price;
        this.isActive=isActive;
    }
}