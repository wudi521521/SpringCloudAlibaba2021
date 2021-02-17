package com.wudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.handler.predicate.RoutePredicateFactory;

@SpringBootApplication
@EnableDiscoveryClient //可添加或者不可添加此注解
public class Gateway8989Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway8989Application.class, args);
    }

    RoutePredicateFactory routePredicateFactory;
}
