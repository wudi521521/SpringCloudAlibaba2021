package com.wudi.controller;

import com.wudi.clients.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/14 13:16
 */
@RestController
@Slf4j
public class TestFeignController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/feign/open")
    public void showMsg(){
          log.info("进入测试feign调用方法");
        String msg = productClient.showMsg();
        log.info("调用商品服务返回信息:"+msg);
    }
}
