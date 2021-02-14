package com.wudi.controller;

import com.netflix.loadbalancer.*;
import com.wudi.model.BaseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
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

    @GetMapping("/product/find/one")
    public Map<String,Object> findOne(String productId){
        log.info("参数打印:"+productId);
        Map map = new HashMap();
        map.put("A","A");
        map.put("B","B");
        return map;
    }

    @PostMapping("/product/find/one/post")
    public Map<String,Object> findOnePost(String productId){
        log.info("参数打印 post:"+productId);
        Map map = new HashMap();
        map.put("A","A");
        map.put("B","B");
        return map;
    }

    @PostMapping("/product/find/all/post")
    public Map<String,Object> findAllPost(@RequestBody BaseData baseData){
        log.info("参数打印 post:"+baseData);
        Map map = new HashMap();
        map.put("A","A");
        map.put("B","B");
        return map;
    }


    @GetMapping("/product/find/all")
    public Map<String,Object> findAll(BaseData baseData){
        log.info("参数打印:"+baseData);
        Map map = new HashMap();
        map.put("A","A");
        map.put("B","B");
        return map;
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
