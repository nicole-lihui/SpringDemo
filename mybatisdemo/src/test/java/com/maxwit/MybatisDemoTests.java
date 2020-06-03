package com.maxwit;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

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
