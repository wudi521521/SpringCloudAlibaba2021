package com.wudi.controller;

import com.netflix.loadbalancer.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dillon Wu
 * @Description:商品
 * @date 2021/2/1 18:02
 */
@RestController
@Slf4j
public class ProductController {
    private static AtomicInteger nextServerCyclicCounter;


    @GetMapping("/product/show/msg")
    public String showMsg(){
        log.info("进入商品服务,展示商品----");

        return "进入商品服务，展示商品";
    }

    public static void main(String[] args) {
     /*int number =   1%4;
        System.out.println("==:"+number);*/
     //测试AtomicInteger
         nextServerCyclicCounter = new AtomicInteger(0);
        //期望值是1更改值是2
        int i = incrementAndGetModulo(4);
        System.out.println(i);
    }
    private static int incrementAndGetModulo(int modulo) {
        int current;
        int next;
        do {
            current = nextServerCyclicCounter.get();
            System.out.println("===="+current);
            next = (current + 1) % modulo;
        } while(!nextServerCyclicCounter.compareAndSet(current, next));

        return next;
    }
}
