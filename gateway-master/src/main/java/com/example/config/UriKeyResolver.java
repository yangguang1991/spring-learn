package com.example.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/3/26 11:11
 */
@Component
public class UriKeyResolver implements KeyResolver {

    /*
     * @ClassName UriKeyResolver
     * @Desc TODO   根据请求的 uri 限流
     * @Date 2019/6/29 17:25
     * @Version 1.0
     */
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        String s = exchange.getRequest().getURI().getPath();
        String s1 = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();

        return Mono.just(s);
    }

}
