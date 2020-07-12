package com.maxwit.dao.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.80222+08:00", comments="Source Table: user")
    public static final UserDO userDO = new UserDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.802678+08:00", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = userDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.803173+08:00", comments="Source field: user.name")
    public static final SqlColumn<String> name = userDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.803339+08:00", comments="Source field: user.git_id")
    public static final SqlColumn<String> gitId = userDO.gitId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.803443+08:00", comments="Source field: user.ding_id")
    public static final SqlColumn<String> dingId = userDO.dingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.803549+08:00", comments="Source field: user.register_date")
    public static final SqlColumn<Date> registerDate = userDO.registerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.802482+08:00", comments="Source Table: user")
    public static final class UserDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> gitId = column("git_id", JDBCType.VARCHAR);

        public final SqlColumn<String> dingId = column("ding_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> registerDate = column("register_date", JDBCType.TIMESTAMP);

        public UserDO() {
            super("user");
        }
    }
}