package com.maxwit.dao.model;

import java.util.Date;
import javax.annotation.Generated;

public class UserDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.059924+08:00", comments="Source field: t_user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.062913+08:00", comments="Source field: t_user.git_login")
    private String gitLogin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063107+08:00", comments="Source field: t_user.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063265+08:00", comments="Source field: t_user.register_date")
    private Date registerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063438+08:00", comments="Source field: t_user.chat_id")
    private String chatId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.062511+08:00", comments="Source field: t_user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.062841+08:00", comments="Source field: t_user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.062969+08:00", comments="Source field: t_user.git_login")
    public String getGitLogin() {
        return gitLogin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063054+08:00", comments="Source field: t_user.git_login")
    public void setGitLogin(String gitLogin) {
        this.gitLogin = gitLogin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.06316+08:00", comments="Source field: t_user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063215+08:00", comments="Source field: t_user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063332+08:00", comments="Source field: t_user.register_date")
    public Date getRegisterDate() {
        return registerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063388+08:00", comments="Source field: t_user.register_date")
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.06349+08:00", comments="Source field: t_user.chat_id")
    public String getChatId() {
        return chatId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.063544+08:00", comments="Source field: t_user.chat_id")
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
}