package com.hamitmizrak.ecodationblogproject7.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
//@RequiredArgsConstructor //for inject

//Entity
@Entity
@Table(name="register")
public class RegisterEntity extends BaseEntity implements Serializable {
    public static final Long serialVersionUID=1L;

    @Column(name="name",length = 100,columnDefinition = "varchar(255) default 'ürün adını girmediniz' ")
    private String name;

    private String surname;

    //Javada olsun ama database kaydetmesin
    //@Transient
    //private String justJavaData;

    //@Lob
    //private String bigData;

    @Column(name="email")
    private String email;
    private String telephone;
    private String hescode;
    private String password;
}
