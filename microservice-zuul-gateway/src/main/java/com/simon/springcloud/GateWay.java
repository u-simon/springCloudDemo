package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author simon
 * @Date 2019-05-12 08:57
 */
@SpringBootApplication
@EnableZuulProxy
public class GateWay {

	public static void main(String[] args) {
		SpringApplication.run(GateWay.class, args);
	}
}
