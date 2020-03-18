package com.xue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //申明这是一个Eureka服务
public class EurekaApp_9100 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp_9100.class,args);
    }
}
