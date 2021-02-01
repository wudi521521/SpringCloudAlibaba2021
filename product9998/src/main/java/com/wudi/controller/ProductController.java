package com.wudi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dillon Wu
 * @Description:商品
 * @date 2021/2/1 18:02
 */
@RestController
@Slf4j
public class ProductController {

    @GetMapping("/product/showMsg")
    public String showMsg(){
        log.info("进入商品服务,展示商品----");
        return "进入商品服务，展示商品";
    }
}
