package com.example.myspringcloud.eureka_consumer_feign;

import org.springframework.stereotype.Component;

/**
 * @author qxx on 2018/11/20.
 */
@Component
public class HelloRemoteHiHystric implements HelloRemote  {
    @Override
    public String hi(String name) {
        return "sorry! " + name;
    }
}
