package com.wudi.controller;

import com.wudi.clients.ProductClient;
import com.wudi.model.BaseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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

    @GetMapping("/feign/find/one")
    public Map<String,Object> findOne(String productId){
        Map<String, Object> clientOne = productClient.findOne(productId);
        return clientOne;
    }

    @GetMapping("/feign/find/all")
    public Map<String,Object> findAll(BaseData baseData){
        log.info("参数打印:"+baseData);

        Map<String, Object> clientOne = productClient.findAll(baseData);
        return clientOne;
    }

    @GetMapping("/feign/find/one/post")
    public Map<String,Object> findOnePost(String productId){
        Map<String, Object> clientOne = productClient.findOnePost(productId);
        return clientOne;
    }

    @GetMapping("/feign/find/all/post")
    public Map<String,Object> findAllPost(BaseData baseData){
        log.info("参数打印:"+baseData);

        Map<String, Object> clientOne = productClient.findAllPost(baseData);
        return clientOne;
    }
}
