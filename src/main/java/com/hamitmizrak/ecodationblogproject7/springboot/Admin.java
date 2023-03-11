package com.hamitmizrak.ecodationblogproject7.springboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class Admin {
    private Long id;
    private String adminName;
    private String adminSurname;
}