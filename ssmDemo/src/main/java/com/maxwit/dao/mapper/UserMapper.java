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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.815564+08:00", comments="Source Table: user")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, gitId, dingId, registerDate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.804415+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.805255+08:00", comments="Source Table: user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.805778+08:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.806462+08:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.807039+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserDOResult")
    Optional<UserDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.80781+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="git_id", property="gitId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ding_id", property="dingId", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_date", property="registerDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.809461+08:00", comments="Source Table: user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.809915+08:00", comments="Source Table: user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.810283+08:00", comments="Source Table: user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.810674+08:00", comments="Source Table: user")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.811226+08:00", comments="Source Table: user")
    default int insert(UserDO record) {
        return MyBatis3Utils.insert(this::insert, record, userDO, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gitId).toProperty("gitId")
            .map(dingId).toProperty("dingId")
            .map(registerDate).toProperty("registerDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.812393+08:00", comments="Source Table: user")
    default int insertMultiple(Collection<UserDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userDO, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gitId).toProperty("gitId")
            .map(dingId).toProperty("dingId")
            .map(registerDate).toProperty("registerDate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.812981+08:00", comments="Source Table: user")
    default int insertSelective(UserDO record) {
        return MyBatis3Utils.insert(this::insert, record, userDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(gitId).toPropertyWhenPresent("gitId", record::getGitId)
            .map(dingId).toPropertyWhenPresent("dingId", record::getDingId)
            .map(registerDate).toPropertyWhenPresent("registerDate", record::getRegisterDate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.816971+08:00", comments="Source Table: user")
    default Optional<UserDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.817507+08:00", comments="Source Table: user")
    default List<UserDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.817901+08:00", comments="Source Table: user")
    default List<UserDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.818791+08:00", comments="Source Table: user")
    default Optional<UserDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.819437+08:00", comments="Source Table: user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.820056+08:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateAllColumns(UserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(gitId).equalTo(record::getGitId)
                .set(dingId).equalTo(record::getDingId)
                .set(registerDate).equalTo(record::getRegisterDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.820596+08:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(gitId).equalToWhenPresent(record::getGitId)
                .set(dingId).equalToWhenPresent(record::getDingId)
                .set(registerDate).equalToWhenPresent(record::getRegisterDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.821438+08:00", comments="Source Table: user")
    default int updateByPrimaryKey(UserDO record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(gitId).equalTo(record::getGitId)
            .set(dingId).equalTo(record::getDingId)
            .set(registerDate).equalTo(record::getRegisterDate)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-29T11:42:01.821963+08:00", comments="Source Table: user")
    default int updateByPrimaryKeySelective(UserDO record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(gitId).equalToWhenPresent(record::getGitId)
            .set(dingId).equalToWhenPresent(record::getDingId)
            .set(registerDate).equalToWhenPresent(record::getRegisterDate)
            .where(id, isEqualTo(record::getId))
        );
    }
}