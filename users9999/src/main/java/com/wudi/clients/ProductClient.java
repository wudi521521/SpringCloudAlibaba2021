package com.wudi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Dillon Wu
 * @Description: 调用商品服务的 openFeign组件
 * @date 2021/2/14 13:10
 */
@FeignClient(value = "products")//作用:用来标识当前接口是一个Feign组件,value书写服务的serviceId 服务名字
public interface ProductClient {

    @GetMapping("/product/show/msg")
    String showMsg();
}
