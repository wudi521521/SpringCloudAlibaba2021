package com.wudi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/20 19:38
 */
@RefreshScope //刷新代码代码注解
@RestController
public class DemoController {
    @Value("${name}")
    private String name;

    @GetMapping("/demo/name")
    public String query(){

        return name;
    }
}
