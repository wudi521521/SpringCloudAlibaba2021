package com.wudi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

@EnableDiscoveryClient //可以不用添加
@SpringBootApplication
public class Configclient7879Application {



    public static void main(String[] args) {
        SpringApplication.run(Configclient7879Application.class, args);
    }

}
