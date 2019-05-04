package com.simon.springcloud.feign.controller;

import com.simon.springcloud.model.Dept;
import com.simon.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author simon
 * @Date 2019-05-04 15:18
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	DeptClientService deptClientService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(Dept dept) {
		return deptClientService.add(dept);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Dept queryById(@PathVariable("id") Long id) {
		return deptClientService.queryById(id);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Dept> queryAll() {
		return deptClientService.queryAll();
	}
}
