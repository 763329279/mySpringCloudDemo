package com.springcloudexample.config_service_git;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServiceGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceGitApplication.class, args);
    }

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
