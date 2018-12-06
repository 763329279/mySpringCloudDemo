package com.example.myspringcloud.eureka_consumer_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qxx on 2018/11/20.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloRemote.hi(name);
    }

}
