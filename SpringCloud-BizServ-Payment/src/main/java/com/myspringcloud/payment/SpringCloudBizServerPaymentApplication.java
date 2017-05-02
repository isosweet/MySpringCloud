package com.myspringcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //激活Eureka中DiscoveryCleint实现
public class SpringCloudBizServerPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudBizServerPaymentApplication.class, args);
	}
}
