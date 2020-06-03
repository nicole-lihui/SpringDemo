package com.demo.sercurity.dao.mapper;

import static com.demo.sercurity.dao.mapper.RoleUserDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.demo.sercurity.dao.model.RoleUserDO;
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
public interface RoleUserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215503+08:00", comments="Source Table: user_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, uid, rid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214566+08:00", comments="Source Table: user_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214702+08:00", comments="Source Table: user_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214752+08:00", comments="Source Table: user_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RoleUserDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214802+08:00", comments="Source Table: user_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RoleUserDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214858+08:00", comments="Source Table: user_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleUserDOResult")
    Optional<RoleUserDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.214912+08:00", comments="Source Table: user_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleUserDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="rid", property="rid", jdbcType=JdbcType.INTEGER)
    })
    List<RoleUserDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215004+08:00", comments="Source Table: user_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215058+08:00", comments="Source Table: user_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleUserDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215109+08:00", comments="Source Table: user_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleUserDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215149+08:00", comments="Source Table: user_role")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215229+08:00", comments="Source Table: user_role")
    default int insert(RoleUserDO record) {
        return MyBatis3Utils.insert(this::insert, record, roleUserDO, c ->
            c.map(id).toProperty("id")
            .map(uid).toProperty("uid")
            .map(rid).toProperty("rid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215304+08:00", comments="Source Table: user_role")
    default int insertMultiple(Collection<RoleUserDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, roleUserDO, c ->
            c.map(id).toProperty("id")
            .map(uid).toProperty("uid")
            .map(rid).toProperty("rid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215379+08:00", comments="Source Table: user_role")
    default int insertSelective(RoleUserDO record) {
        return MyBatis3Utils.insert(this::insert, record, roleUserDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(uid).toPropertyWhenPresent("uid", record::getUid)
            .map(rid).toPropertyWhenPresent("rid", record::getRid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215548+08:00", comments="Source Table: user_role")
    default Optional<RoleUserDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleUserDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215593+08:00", comments="Source Table: user_role")
    default List<RoleUserDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleUserDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.21564+08:00", comments="Source Table: user_role")
    default List<RoleUserDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleUserDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215682+08:00", comments="Source Table: user_role")
    default Optional<RoleUserDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215733+08:00", comments="Source Table: user_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleUserDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215777+08:00", comments="Source Table: user_role")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleUserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(uid).equalTo(record::getUid)
                .set(rid).equalTo(record::getRid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215874+08:00", comments="Source Table: user_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleUserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(uid).equalToWhenPresent(record::getUid)
                .set(rid).equalToWhenPresent(record::getRid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.215976+08:00", comments="Source Table: user_role")
    default int updateByPrimaryKey(RoleUserDO record) {
        return update(c ->
            c.set(uid).equalTo(record::getUid)
            .set(rid).equalTo(record::getRid)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.216066+08:00", comments="Source Table: user_role")
    default int updateByPrimaryKeySelective(RoleUserDO record) {
        return update(c ->
            c.set(uid).equalToWhenPresent(record::getUid)
            .set(rid).equalToWhenPresent(record::getRid)
            .where(id, isEqualTo(record::getId))
        );
    }
}