package com.maxwit.dao.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.066795+08:00", comments="Source Table: t_user")
    public static final UserDO userDO = new UserDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.067362+08:00", comments="Source field: t_user.id")
    public static final SqlColumn<Integer> id = userDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.067854+08:00", comments="Source field: t_user.git_login")
    public static final SqlColumn<String> gitLogin = userDO.gitLogin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.067953+08:00", comments="Source field: t_user.password")
    public static final SqlColumn<String> password = userDO.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.06803+08:00", comments="Source field: t_user.register_date")
    public static final SqlColumn<Date> registerDate = userDO.registerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.068123+08:00", comments="Source field: t_user.chat_id")
    public static final SqlColumn<String> chatId = userDO.chatId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.067121+08:00", comments="Source Table: t_user")
    public static final class UserDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> gitLogin = column("git_login", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Date> registerDate = column("register_date", JDBCType.TIMESTAMP);

        public final SqlColumn<String> chatId = column("chat_id", JDBCType.VARCHAR);

        public UserDO() {
            super("t_user");
        }
    }
}