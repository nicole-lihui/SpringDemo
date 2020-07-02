package com.maxwit.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.628217+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.62868+08:00", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.629117+08:00", comments="Source field: user.name")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.629222+08:00", comments="Source field: user.git_id")
    public static final SqlColumn<String> gitId = user.gitId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.629302+08:00", comments="Source field: user.ding_id")
    public static final SqlColumn<String> dingId = user.dingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.6294+08:00", comments="Source field: user.register_date")
    public static final SqlColumn<Date> registerDate = user.registerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-27T11:14:33.628463+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> gitId = column("git_id", JDBCType.VARCHAR);

        public final SqlColumn<String> dingId = column("ding_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> registerDate = column("register_date", JDBCType.TIMESTAMP);

        public User() {
            super("user");
        }
    }
}