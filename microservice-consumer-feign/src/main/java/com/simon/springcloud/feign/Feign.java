package com.simon.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author simon
 * @Date 2019-05-04 15:24
 */
@SpringBootApplication
@EnableFeignClients(value = "com.simon.springcloud")
@ComponentScan(value = "com.simon.springcloud")
@EnableEurekaClient
public class Feign {
    public static void main(String[] args) {
        SpringApplication.run(Feign.class, args);
    }
}
