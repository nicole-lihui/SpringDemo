package com.demo.sercurity.dao.model;

import javax.annotation.Generated;

public class RoleDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211353+08:00", comments="Source field: role.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211519+08:00", comments="Source field: role.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211636+08:00", comments="Source field: role.cname")
    private String cname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.21144+08:00", comments="Source field: role.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211483+08:00", comments="Source field: role.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211556+08:00", comments="Source field: role.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211595+08:00", comments="Source field: role.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211675+08:00", comments="Source field: role.cname")
    public String getCname() {
        return cname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211713+08:00", comments="Source field: role.cname")
    public void setCname(String cname) {
        this.cname = cname;
    }
}