package com.garwer.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RefreshScope
public class EnvController {
    @Value("${env}")
    private String env;

    @GetMapping("/getEnv")
    public String getEnv() {
        return env;
    }
}
