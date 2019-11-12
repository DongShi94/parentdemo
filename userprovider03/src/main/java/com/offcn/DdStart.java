package com.offcn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.offcn.mapper")
public class DdStart {
    public static void main(String[] args) {
        SpringApplication.run(DdStart.class);
    }
}
