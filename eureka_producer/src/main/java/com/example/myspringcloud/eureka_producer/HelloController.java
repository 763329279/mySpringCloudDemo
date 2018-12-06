package com.example.myspringcloud.eureka_producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qxx on 2018/11/20.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String serveName;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi " + name + ",i am from " + serveName + ":" + port;
    }
}
