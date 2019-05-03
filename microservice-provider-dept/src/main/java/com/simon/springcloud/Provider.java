package com.simon.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author simon
 * @Date 2019-05-03 09:06
 */
@SpringBootApplication
@MapperScan("com.simon.springcloud.mapper")
public class Provider {

    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }
}
