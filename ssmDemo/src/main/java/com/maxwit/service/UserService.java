package com.maxwit.service;

import com.maxwit.dao.mapper.UserMapper;
import com.maxwit.dao.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public UserDO showByid(@PathVariable int id) {
        Optional<UserDO> optional = userMapper.selectByPrimaryKey(id);
        return optional.get();
    }
}
