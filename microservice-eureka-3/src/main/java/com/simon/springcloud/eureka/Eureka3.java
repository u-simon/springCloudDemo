package com.simon.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author simon
 * @Date 2019-05-03 15:56
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka3.class, args);
    }
}
