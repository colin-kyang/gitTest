package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//主程序类
//@SpringBootApplication:这是一个SpringBoot应用

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //尝试使用Git版本管理
        System.out.printf("hello github");
        System.out.println("hello github");
        SpringApplication.run(MainApplication.class,args);
    }

}
