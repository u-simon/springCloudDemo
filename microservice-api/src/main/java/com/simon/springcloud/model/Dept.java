package com.simon.springcloud.model;

import lombok.Builder;
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

    public Dept(Integer deptno, String dname, String db_source) {
        long l = deptno.longValue();
        this.deptno = l;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Dept() {
    }
}
