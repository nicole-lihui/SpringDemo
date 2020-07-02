package com.maxwit.model;

import java.util.Date;
import javax.annotation.Generated;

public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.619648+08:00", comments="Source field: user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.623682+08:00", comments="Source field: user.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.623901+08:00", comments="Source field: user.git_id")
    private String gitId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.624081+08:00", comments="Source field: user.ding_id")
    private String dingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.624257+08:00", comments="Source field: user.register_date")
    private Date registerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.623124+08:00", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.623593+08:00", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.62375+08:00", comments="Source field: user.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.623842+08:00", comments="Source field: user.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.623958+08:00", comments="Source field: user.git_id")
    public String getGitId() {
        return gitId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.624022+08:00", comments="Source field: user.git_id")
    public void setGitId(String gitId) {
        this.gitId = gitId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.62414+08:00", comments="Source field: user.ding_id")
    public String getDingId() {
        return dingId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.624203+08:00", comments="Source field: user.ding_id")
    public void setDingId(String dingId) {
        this.dingId = dingId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.624336+08:00", comments="Source field: user.register_date")
    public Date getRegisterDate() {
        return registerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.624413+08:00", comments="Source field: user.register_date")
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}