package com.offcn;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuuApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuuApplication.class);
    }
}
