package com.hamitmizrak.ecodationblogproject7.springboot._03_SpringDATA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegisterRepository extends JpaRepository<RegisterEntity,Long> {
}
