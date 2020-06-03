package com.demo.sercurity.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211797+08:00", comments="Source Table: role")
    public static final RoleDO roleDO = new RoleDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212003+08:00", comments="Source field: role.id")
    public static final SqlColumn<Integer> id = roleDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212072+08:00", comments="Source field: role.name")
    public static final SqlColumn<String> name = roleDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212126+08:00", comments="Source field: role.cname")
    public static final SqlColumn<String> cname = roleDO.cname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.211918+08:00", comments="Source Table: role")
    public static final class RoleDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> cname = column("cname", JDBCType.VARCHAR);

        public RoleDO() {
            super("role");
        }
    }
}