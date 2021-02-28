package com.example.redis;

import com.example.redis.server.RedisServer;
import com.example.redis.util.GenericJackson2JsonRedisTemplate;
import com.ymdx.common.redis.util.RedisObjectSerializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.net.UnknownHostException;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2020/9/15 11:43
 */

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableScheduling
public class RedisMain implements CommandLineRunner {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active","dev");
        SpringApplication.run(RedisMain.class, args);
    }

    @Autowired
    private GenericJackson2JsonRedisTemplate jackson2JsonRedisTemplate;
    @Autowired
    private RedisServer redisServer;

    @Override
    public void run(String... args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                redisServer.start();
            }
        }).start();
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        RedisSerializer stringSerializer = new StringRedisSerializer();
        RedisSerializer redisObjectSerializer = new RedisObjectSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    @Bean
    public GenericJackson2JsonRedisTemplate jackson2JsonRedisTemplate(RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {
        GenericJackson2JsonRedisTemplate template = new GenericJackson2JsonRedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}
