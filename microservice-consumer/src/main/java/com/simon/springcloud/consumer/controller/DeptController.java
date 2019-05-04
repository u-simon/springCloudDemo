package com.simon.springcloud.consumer.controller;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simon.springcloud.model.Dept;

import java.util.List;

/**
 * @Author simon
 * @Date 2019-05-03 10:00
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    RestTemplate restTemplate;

//    private static final String URL = "http://localhost:8001";
    private static final String URL = "http://MICROSERVICE-PROVIDER";

    @RequestMapping(value = "/add", method = POST)
    public boolean add(Dept dept){
        return restTemplate.postForObject(URL + "/dept/add", Dept.class, Boolean.class);
    }

    @RequestMapping( value = "/get/{id}", method = GET)
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(URL + "/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "/list", method = GET)
    public List<Dept> list(){
        return restTemplate.getForObject(URL + "/dept/list" , List.class);
    }
}
