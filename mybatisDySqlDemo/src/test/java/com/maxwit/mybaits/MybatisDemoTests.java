package com.maxwit.mybaits;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import com.maxwit.mybatis.MybatisDemo;
import com.maxwit.mybatis.User;
import org.junit.Test;

public class MybatisDemoTests {

    @Test
    public void buidSqlSessionFactory() throws IOException {
        MybatisDemo mybatisDemo = new MybatisDemo();
        User user = mybatisDemo.buidSqlSessionFactory();
        System.out.println(user.getId() + " : " + user.getName());
        assertNotNull(user);
    }
}
