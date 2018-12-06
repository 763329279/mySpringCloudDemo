package com.example.myspringcloud.eureka_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author qxx on 2018/11/20.
 */
@Service
public class HelloService {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi(String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("SPRING-CLOUD-PRODUCER");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hi?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }

}
