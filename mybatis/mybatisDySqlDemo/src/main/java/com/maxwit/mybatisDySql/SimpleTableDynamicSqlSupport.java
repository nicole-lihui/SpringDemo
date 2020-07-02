package com.maxwit.mybatisDySql;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import java.sql.JDBCType;
import java.util.Date;

public final class SimpleTableDynamicSqlSupport {
    public static final SimpleTable simpleTable = new SimpleTable();
    public static final SqlColumn<Integer> id = simpleTable.id;
    public static final SqlColumn<String> name = simpleTable.name;

    public static final class SimpleTable extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public SimpleTable() {
            super("user");
        }
    }
}