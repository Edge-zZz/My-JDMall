package com.cloud.mall.cloudmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMemberApplication.class, args);
	}

}
