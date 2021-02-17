package com.wudi.clients;

import com.wudi.fallback.ProductClientFallBack;
import com.wudi.model.BaseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author Dillon Wu
 * @Description: 调用商品服务的 openFeign组件
 * @date 2021/2/14 13:10
 */
@FeignClient(value = "products", fallback = ProductClientFallBack.class)
//作用:用来标识当前接口是一个Feign组件,value书写服务的serviceId 服务名字
//fallback 客户端降级
public interface ProductClient {

    @GetMapping("/product/show/msg")
    String showMsg();

    /**
     * 根据商品id查询商品信息
     * 注意：使用openFeign的get方式传递 参数变量必须通过@ReqeustParam注解进行修饰
     */
    @GetMapping("/product/find/one")
    Map<String, Object> findOne(@RequestParam("productId") String productId);

    /**
     * 注意：使用openFeign的get方式传递 参数变量是个实体必须通过@SpringQueryMap注解进行修饰
     *
     * @param baseData
     * @return
     */
    @GetMapping("/product/find/all")
    Map<String, Object> findAll(@SpringQueryMap BaseData baseData);

    /**
     * 根据商品id查询商品信息
     * 注意：使用openFeign的post方式传递 参数变量必须通过@ReqeustParam注解进行修饰
     */
    @PostMapping("/product/find/one/post")
    Map<String, Object> findOnePost(@RequestParam("productId") String productId);

    /**
     * 注意：使用openFeign的get方式传递对象信息 要求服务提供方和服务调用方必须使用@RequestBody进行实体修饰
     *
     * @param baseData
     * @return
     */
    @PostMapping("/product/find/all/post")
    Map<String, Object> findAllPost(@RequestBody BaseData baseData);
}
