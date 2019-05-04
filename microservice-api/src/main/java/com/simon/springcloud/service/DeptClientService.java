package com.simon.springcloud.service;

import com.simon.springcloud.model.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author simon
 * @Date 2019-05-04 15:11
 */
@FeignClient(value = "MICROSERVICE-PROVIDER")
public interface DeptClientService {

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept queryById(@PathVariable("id") Long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> queryAll();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);
}
