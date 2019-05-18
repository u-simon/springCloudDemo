package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author simon
 * @Date 2019-05-12 10:32
 */
@SpringBootApplication
@EnableConfigServer
public class Config {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
