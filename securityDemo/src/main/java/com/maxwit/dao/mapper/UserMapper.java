package com.maxwit.dao.mapper;

import static com.maxwit.dao.mapper.UserDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.maxwit.dao.model.UserDO;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.079143+08:00", comments="Source Table: t_user")
    BasicColumn[] selectList = BasicColumn.columnList(id, gitLogin, password, registerDate, chatId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.068788+08:00", comments="Source Table: t_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.06953+08:00", comments="Source Table: t_user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.069911+08:00", comments="Source Table: t_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.070493+08:00", comments="Source Table: t_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.071202+08:00", comments="Source Table: t_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserDOResult")
    Optional<UserDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.071872+08:00", comments="Source Table: t_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="git_login", property="gitLogin", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_date", property="registerDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="chat_id", property="chatId", jdbcType=JdbcType.VARCHAR)
    })
    List<UserDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.073054+08:00", comments="Source Table: t_user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.073385+08:00", comments="Source Table: t_user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.073734+08:00", comments="Source Table: t_user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.07409+08:00", comments="Source Table: t_user")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.074492+08:00", comments="Source Table: t_user")
    default int insert(UserDO record) {
        return MyBatis3Utils.insert(this::insert, record, userDO, c ->
            c.map(id).toProperty("id")
            .map(gitLogin).toProperty("gitLogin")
            .map(password).toProperty("password")
            .map(registerDate).toProperty("registerDate")
            .map(chatId).toProperty("chatId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.075511+08:00", comments="Source Table: t_user")
    default int insertMultiple(Collection<UserDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userDO, c ->
            c.map(id).toProperty("id")
            .map(gitLogin).toProperty("gitLogin")
            .map(password).toProperty("password")
            .map(registerDate).toProperty("registerDate")
            .map(chatId).toProperty("chatId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.075981+08:00", comments="Source Table: t_user")
    default int insertSelective(UserDO record) {
        return MyBatis3Utils.insert(this::insert, record, userDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(gitLogin).toPropertyWhenPresent("gitLogin", record::getGitLogin)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(registerDate).toPropertyWhenPresent("registerDate", record::getRegisterDate)
            .map(chatId).toPropertyWhenPresent("chatId", record::getChatId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.08004+08:00", comments="Source Table: t_user")
    default Optional<UserDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.080444+08:00", comments="Source Table: t_user")
    default List<UserDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.080789+08:00", comments="Source Table: t_user")
    default List<UserDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.08115+08:00", comments="Source Table: t_user")
    default Optional<UserDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.081465+08:00", comments="Source Table: t_user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.081856+08:00", comments="Source Table: t_user")
    static UpdateDSL<UpdateModel> updateAllColumns(UserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(gitLogin).equalTo(record::getGitLogin)
                .set(password).equalTo(record::getPassword)
                .set(registerDate).equalTo(record::getRegisterDate)
                .set(chatId).equalTo(record::getChatId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.082346+08:00", comments="Source Table: t_user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(gitLogin).equalToWhenPresent(record::getGitLogin)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(registerDate).equalToWhenPresent(record::getRegisterDate)
                .set(chatId).equalToWhenPresent(record::getChatId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.083086+08:00", comments="Source Table: t_user")
    default int updateByPrimaryKey(UserDO record) {
        return update(c ->
            c.set(gitLogin).equalTo(record::getGitLogin)
            .set(password).equalTo(record::getPassword)
            .set(registerDate).equalTo(record::getRegisterDate)
            .set(chatId).equalTo(record::getChatId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-31T11:02:23.083544+08:00", comments="Source Table: t_user")
    default int updateByPrimaryKeySelective(UserDO record) {
        return update(c ->
            c.set(gitLogin).equalToWhenPresent(record::getGitLogin)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(registerDate).equalToWhenPresent(record::getRegisterDate)
            .set(chatId).equalToWhenPresent(record::getChatId)
            .where(id, isEqualTo(record::getId))
        );
    }
}