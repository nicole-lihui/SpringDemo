package com.demo.sercurity.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.192866+08:00", comments="Source Table: user")
    public static final UserDO userDO = new UserDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.193253+08:00", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = userDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.193657+08:00", comments="Source field: user.username")
    public static final SqlColumn<String> username = userDO.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.193763+08:00", comments="Source field: user.password")
    public static final SqlColumn<String> password = userDO.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.193843+08:00", comments="Source field: user.enabled")
    public static final SqlColumn<Boolean> enabled = userDO.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.193921+08:00", comments="Source field: user.locked")
    public static final SqlColumn<Boolean> locked = userDO.locked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.193099+08:00", comments="Source Table: user")
    public static final class UserDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);

        public final SqlColumn<Boolean> locked = column("locked", JDBCType.BOOLEAN);

        public UserDO() {
            super("user");
        }
    }
}