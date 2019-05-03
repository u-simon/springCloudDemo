package com.simon.springcloud.mapper;

import com.simon.springcloud.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author simon
 * @Date 2019-05-03 08:44
 */
@Mapper
public interface DeptMapper {
	boolean add(Dept dept);

	Dept queryById(@Param("id") Long id);

	List<Dept> queryAll();
}
