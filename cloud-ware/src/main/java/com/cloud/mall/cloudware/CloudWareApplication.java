package com.cloud.mall.cloudware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudWareApplication.class, args);
    }

}
