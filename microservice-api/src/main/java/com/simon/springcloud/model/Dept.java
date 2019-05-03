package com.simon.springcloud.model;

import lombok.Data;

/**
 * @Author simon
 * @Date 2019-05-02 14:11
 */
@Data
public class Dept {
    private Long deptno;
    private String dname;
    private String db_source;
}
