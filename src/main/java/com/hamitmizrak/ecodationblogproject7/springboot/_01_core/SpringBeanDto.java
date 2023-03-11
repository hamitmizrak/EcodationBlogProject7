package com.hamitmizrak.ecodationblogproject7.springboot._01_core;

//bean:

import lombok.*;
import lombok.extern.log4j.Log4j2;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class SpringBeanDto {
    private Long id;
    private String beanName;
}
