package com.hamitmizrak.ecodationblogproject7.springboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class RegisterDto {

    private Long id;

    @NotEmpty(message = " adını boş geçilmez")
    private String name;

    @NotEmpty(message = " surname boş geçimezsiniz")
    private String surname;

    //Hm123@
    @NotEmpty(message = " şifre boş geçimezsiniz")
    @Size(min = 5,max = 14,message = "şifre kodu en az 5 olacak,  en fazla 14 olmalıdır.")
    private String password;

    @NotEmpty(message = "Admin hescode boş geçemezsiniz")
    private String hescode;

    @NotEmpty(message = " email Address boş geçimezsiniz")
    @Email(message = " email uygun formatta girmediniz")
    private String email;
}

/*

-- Create Database
CREATE SCHEMA `blog` DEFAULT CHARACTER SET utf8 ;

-- Database select
use blog;

CREATE TABLE `blog`.`register` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(150) NULL DEFAULT 'kullanıcı adını girmediniz',
  `surname` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `email` VARCHAR(250) NULL,
  `create_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));


*/