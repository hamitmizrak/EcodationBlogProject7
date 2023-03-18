package com.hamitmizrak.ecodationblogproject7.data.repository;


import com.hamitmizrak.ecodationblogproject7.data.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegisterRepository extends JpaRepository<RegisterEntity,Long> {
    //delivered Query
}
