package com.hamitmizrak.ecodationblogproject7.springboot._03_SpringDATA;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

//Data
@Entity
@Table(name="register")
public class RegisterEntity extends BaseEntity implements Serializable {
    public static final Long serialVersionUID=1L;

    @Column(name = "name",length = 150,columnDefinition ="varchar(150) default soyadi girilmedi" )
    private String name;
    private String surname;
    private String password;
    private String hescode;
    private String email;
}

/*
    private Long id;
    private String name;
    private String surname;
    private String password;
    private String hescode;
    private String email;
*/
