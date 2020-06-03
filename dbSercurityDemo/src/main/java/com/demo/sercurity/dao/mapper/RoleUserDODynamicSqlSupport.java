package com.demo.sercurity.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleUserDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.21424+08:00", comments="Source Table: user_role")
    public static final RoleUserDO roleUserDO = new RoleUserDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214413+08:00", comments="Source field: user_role.id")
    public static final SqlColumn<Integer> id = roleUserDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.21447+08:00", comments="Source field: user_role.uid")
    public static final SqlColumn<Integer> uid = roleUserDO.uid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214518+08:00", comments="Source field: user_role.rid")
    public static final SqlColumn<Integer> rid = roleUserDO.rid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214339+08:00", comments="Source Table: user_role")
    public static final class RoleUserDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> uid = column("uid", JDBCType.INTEGER);

        public final SqlColumn<Integer> rid = column("rid", JDBCType.INTEGER);

        public RoleUserDO() {
            super("user_role");
        }
    }
}