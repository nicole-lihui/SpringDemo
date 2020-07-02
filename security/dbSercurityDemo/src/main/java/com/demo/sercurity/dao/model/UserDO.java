package com.demo.sercurity.dao.model;

import org.springframework.security.core.userdetails.UserDetails;

import javax.annotation.Generated;

public class UserDO  {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.182557+08:00", comments="Source field: user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.188776+08:00", comments="Source field: user.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.188965+08:00", comments="Source field: user.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189126+08:00", comments="Source field: user.enabled")
    private Boolean enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189283+08:00", comments="Source field: user.locked")
    private Boolean locked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.188367+08:00", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.188707+08:00", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.188834+08:00", comments="Source field: user.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.188912+08:00", comments="Source field: user.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189018+08:00", comments="Source field: user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189074+08:00", comments="Source field: user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189178+08:00", comments="Source field: user.enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189232+08:00", comments="Source field: user.enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189335+08:00", comments="Source field: user.locked")
    public Boolean getLocked() {
        return locked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.189389+08:00", comments="Source field: user.locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}