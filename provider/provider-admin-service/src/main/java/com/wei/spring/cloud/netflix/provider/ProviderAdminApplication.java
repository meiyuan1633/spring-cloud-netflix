package com.wei.spring.cloud.netflix.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*生产者模块*/
@EnableEurekaServer
@SpringBootApplication
public class ProviderAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminApplication.class,args);
    }
}
