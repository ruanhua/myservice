package com.cn.myservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.myservice.mapper")
public class MyserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyserviceApplication.class, args);
    }

}
