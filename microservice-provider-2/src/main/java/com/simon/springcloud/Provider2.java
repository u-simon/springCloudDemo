package com.simon.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author simon
 * @Date 2019-05-03 09:06
 */
@SpringBootApplication
@MapperScan("com.simon.springcloud.mapper")
@EnableEurekaClient
public class Provider2 {
    public static void main(String[] args) {
        SpringApplication.run(Provider2.class, args);
    }
}
