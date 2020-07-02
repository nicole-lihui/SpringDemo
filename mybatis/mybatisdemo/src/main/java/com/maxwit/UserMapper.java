package com.maxwit;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    //@Select("SELECT * FROM user")
    public User selectUser(int id);
}
