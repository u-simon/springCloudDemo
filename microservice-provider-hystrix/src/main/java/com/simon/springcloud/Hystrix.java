package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author simon
 * @Date 2019-05-04 16:53
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix.class, args);
    }
}
