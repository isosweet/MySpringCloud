package com.myspringcloud.userClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudUserClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserClientApplication.class, args);
	}
}
