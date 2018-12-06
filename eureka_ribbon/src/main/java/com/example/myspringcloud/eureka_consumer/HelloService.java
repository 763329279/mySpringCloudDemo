package com.example.myspringcloud.eureka_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author qxx on 2018/11/20.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/hi?name=" + name, String.class);
    }

}
