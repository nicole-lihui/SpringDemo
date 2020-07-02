package com.maxwit.service;

import com.maxwit.dao.mapper.UserMapper;
import com.maxwit.dao.model.UserDO;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.maxwit.dao.mapper.UserDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    public UserDO selectUser(String name) {

        SelectStatementProvider selectStatement = select(userDO.allColumns())
                .from(userDO)
                .where(gitLogin, isEqualTo(name))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        UserDO user = userMapper.selectOne(selectStatement).get();

        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDO user = null;
        user = selectUser(s);
        if (user == null) {
            throw new UsernameNotFoundException("Account not exsits");
        }

        return new User(user.getGitLogin(), user.getPassword(),
                Arrays.asList(new SimpleGrantedAuthority("ROLE_user")));
    }
}
