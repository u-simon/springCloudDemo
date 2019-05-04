package com.simon.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author simon
 * @Date 2019-05-04 11:14
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.simon.springcloud.mapper")
public class Provider3 {
    public static void main(String[] args) {
        SpringApplication.run(Provider3.class, args);
    }
}
