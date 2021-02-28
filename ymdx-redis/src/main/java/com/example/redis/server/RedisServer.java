package com.example.redis.server;

import com.example.redis.util.Constant;
import com.example.redis.util.GenericJackson2JsonRedisTemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2020/9/15 11:50
 */

@Slf4j
@Component
public class RedisServer {

    @Autowired
    private GenericJackson2JsonRedisTemplate jackson2JsonRedisTemplate;

    public void start() {
        Set<Object> set = jackson2JsonRedisTemplate.opsForSet().members(Constant.REDIS_CPMP_PRE + ":" + Constant.ALL_CHARGER_PRE);
        for (int i = 1; i <= 3; i++) {
            jackson2JsonRedisTemplate.opsForHash().put("CPMP:CHARGER_STATE:020010700100",
                    String.valueOf("0"+i), "Plug");
        }
        log.info("redis set=" + set);

    }
}
