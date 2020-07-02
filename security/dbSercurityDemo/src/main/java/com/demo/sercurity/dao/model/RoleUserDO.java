package com.demo.sercurity.dao.model;

import javax.annotation.Generated;

public class RoleUserDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213872+08:00", comments="Source field: user_role.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213981+08:00", comments="Source field: user_role.uid")
    private Integer uid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214091+08:00", comments="Source field: user_role.rid")
    private Integer rid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.21391+08:00", comments="Source field: user_role.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213949+08:00", comments="Source field: user_role.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214024+08:00", comments="Source field: user_role.uid")
    public Integer getUid() {
        return uid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214057+08:00", comments="Source field: user_role.uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214123+08:00", comments="Source field: user_role.rid")
    public Integer getRid() {
        return rid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214157+08:00", comments="Source field: user_role.rid")
    public void setRid(Integer rid) {
        this.rid = rid;
    }
}