package com.example.myspringcloud.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qxx on 2018/11/20.
 */
@RestController
@RefreshScope
public class MyController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String serveName;

    @Value("${neo.hello}")
    String hello;


    @RequestMapping("/hi")
    public String hi() {
        return "hi " + hello + ",i am from " + serveName + ":" + port;
    }
}
