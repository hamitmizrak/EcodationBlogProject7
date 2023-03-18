package com.hamitmizrak.ecodationblogproject7.springboot;


import jakarta.validation.constraints.*;
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
public class AdminDto {

    private Long id;

    @NotEmpty(message = "Admin adını boş geçemezsiniz")
    private String adminName;

    @NotEmpty(message = "Admin soyadı boş geçemezsiniz")
    private String adminSurname;

    @NotEmpty(message = "Admin email boş geçemezsiniz")
    @Email(message = "uygun formatta email girmediniz.")
    private String adminEmail;


    @NotEmpty(message = "Admin şifre boş geçemezsiniz")
    @Size(min = 7,max = 50,message = "Lütfen en az 7 en fazla 50 olacak şekilde şifre giriniz")
    //@Pattern(regexp = "")
    private String adminPassword;

    @NotEmpty(message = "Admin hescode boş geçemezsiniz")
    private String hescode;

    @NotEmpty(message = "Admin fiyat boş geçemezsiniz")
    @Min(value=10,message = "En az 10 olması gerekiyor")
    @Max(value=1000,message = "En az 1000 olması gerekiyor")
    private double price;

    private String isActive;
    private Date date=new Date(System.currentTimeMillis());

    //constructor parametreli(overloading)
    public AdminDto(Long id, String adminName, String adminSurname) {
        this.id = id;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }

    //constructor parametreli(overloading)
    public AdminDto(Long id, String adminName, String adminSurname, String hescode, double price, String isActive) {
        this.id = id;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
        this.hescode = hescode;
        this.price=price;
        this.isActive=isActive;
    }
}