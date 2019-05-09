package com.simon.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simon.springcloud.mapper.DeptMapper;
import com.simon.springcloud.model.Dept;
import com.simon.springcloud.service.DeptService;

/**
 * @Author simon
 * @Date 2019-05-03 09:00
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;


    @Override
    public boolean add(Dept dept) {
        return deptMapper.add(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptMapper.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
