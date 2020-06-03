package com.maxwit.mybatis;

import com.maxwit.mybatis.User;

public interface UserMapper {
    //@Select("SELECT * FROM user")
    public User selectUser(int id);
}
