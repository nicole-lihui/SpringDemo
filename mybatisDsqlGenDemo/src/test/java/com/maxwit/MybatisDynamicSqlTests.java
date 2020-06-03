package com.maxwit;

import static com.maxwit.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

import com.maxwit.mapper.UserMapper;
import com.maxwit.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class MybatisDynamicSqlTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void demo() {
        Optional<User> optional = userMapper.selectByPrimaryKey(1);
        System.out.println(optional.isPresent());

        User u = optional.get();
        System.out.println(u.getId() + " : " + u.getName());

        SelectStatementProvider selectStatementProvider = select(user.allColumns())
                .from(user)
                .build()
                .render(RenderingStrategies.MYBATIS3);;
        List<User> userList = userMapper.selectMany(selectStatementProvider);
        userList.forEach(user -> System.out.println(user.getId() + " : " + user.getName()));
    }

}
