package com.simon.springcloud.controller;

import com.simon.springcloud.model.Dept;
import com.simon.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @Author simon
 * @Date 2019-05-03 09:01
 */
@Controller
@RequestMapping("/dept")
@ResponseBody
public class DeptController {

	@Autowired
	DeptService deptService;

	@RequestMapping(value = "/add", method = POST)
	public boolean add(Dept dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/get/{id}", method = GET)
	public Dept get(@PathVariable Long id) {
		Dept dept = deptService.queryById(id);
		return dept	 ;
	}

	@RequestMapping(value = "list", method = GET)
	public List<Dept> list() {
		return deptService.queryAll();
	}
}
