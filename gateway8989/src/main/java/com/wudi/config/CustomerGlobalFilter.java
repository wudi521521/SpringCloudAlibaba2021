package com.wudi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/17 17:54
 */
@Slf4j
@Configuration
public class CustomerGlobalFilter implements GlobalFilter, Ordered {
    @Override//springmvc spring webFlux request,response filterchain
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("进入自定义的filter");
        if (true) {
            log.info("用户身份信息合法,放行请求继续执行");
            return chain.filter(exchange);
        }
        log.info("非法用户，拒绝访问");
        return exchange.getResponse().setComplete();
    }

    @Override
    public int getOrder() {
        //filter 数字越小filter就越先执行
        return -1; //-1最先请求
    }
}
