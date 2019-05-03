package com.simon.springcloud.service;

import com.simon.springcloud.model.Dept;

import java.util.List;

/**
 * @Author simon
 * @Date 2019-05-03 09:00
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();

}
