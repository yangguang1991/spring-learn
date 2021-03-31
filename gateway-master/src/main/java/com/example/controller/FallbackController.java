package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/3/25 17:13
 */
@RestController
public class FallbackController {
    @RequestMapping("/fallback")
    public String fallback() {
        return "I'm Spring Cloud Gateway fallback.";
    }
}
