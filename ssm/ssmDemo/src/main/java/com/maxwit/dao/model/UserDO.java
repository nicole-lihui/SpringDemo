package com.maxwit.dao.model;

import java.util.Date;
import javax.annotation.Generated;

public class UserDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.793249+08:00", comments="Source field: user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.79782+08:00", comments="Source field: user.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798046+08:00", comments="Source field: user.git_id")
    private String gitId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798219+08:00", comments="Source field: user.ding_id")
    private String dingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798392+08:00", comments="Source field: user.register_date")
    private Date registerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.79654+08:00", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.797651+08:00", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.797887+08:00", comments="Source field: user.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.797988+08:00", comments="Source field: user.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798103+08:00", comments="Source field: user.git_id")
    public String getGitId() {
        return gitId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798163+08:00", comments="Source field: user.git_id")
    public void setGitId(String gitId) {
        this.gitId = gitId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798275+08:00", comments="Source field: user.ding_id")
    public String getDingId() {
        return dingId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798337+08:00", comments="Source field: user.ding_id")
    public void setDingId(String dingId) {
        this.dingId = dingId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798467+08:00", comments="Source field: user.register_date")
    public Date getRegisterDate() {
        return registerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.798527+08:00", comments="Source field: user.register_date")
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

}