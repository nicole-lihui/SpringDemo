package com.maxwit.mybatisDySql;

import static com.maxwit.mybatisDySql.SimpleTableDynamicSqlSupport.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import org.apache.ibatis.io.Resources;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

public class SimpleTableAnnotatedMapperTest {

    @Test
    public void testSelectByExample() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            SimpleTableAnnotatedMapper mapper = session.getMapper(SimpleTableAnnotatedMapper.class);

            SelectStatementProvider selectStatement = select(id.as("id"), name)
                    .from(simpleTable)
                    .where(id, isEqualTo(2))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);

            List<SimpleTableRecord> rows = mapper.selectMany(selectStatement);
            rows.forEach(user -> System.out.println(user.getId() + " -> " + user.getName()));
            Assertions.assertNotNull(rows);
        }
    }


}
