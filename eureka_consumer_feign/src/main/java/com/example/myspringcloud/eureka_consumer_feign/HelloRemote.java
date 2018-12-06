package com.example.myspringcloud.eureka_consumer_feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qxx on 2018/11/20.
 */
@Primary
@FeignClient(name= "SPRING-CLOUD-PRODUCER",fallback =HelloRemoteHiHystric.class)
public interface HelloRemote {
    @RequestMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);
}