package com.simon.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author simon
 * @Date 2019-05-03 15:54
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2 {

	public static void main(String[] args) {
		SpringApplication.run(Eureka2.class, args);
	}
}
