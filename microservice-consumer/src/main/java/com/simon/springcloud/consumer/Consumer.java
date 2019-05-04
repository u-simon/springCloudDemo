package com.simon.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author simon
 * @Date 2019-05-03 10:11
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer {
	public static void main(String[] args) {
		SpringApplication.run(Consumer.class, args);
	}
}
