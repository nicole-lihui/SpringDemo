package com.demo.sercurity.dao.mapper;

import static com.demo.sercurity.dao.mapper.RoleDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.demo.sercurity.dao.model.RoleDO;
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
public interface RoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213092+08:00", comments="Source Table: role")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, cname);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212191+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212244+08:00", comments="Source Table: role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212293+08:00", comments="Source Table: role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RoleDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212344+08:00", comments="Source Table: role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RoleDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212406+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleDOResult")
    Optional<RoleDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212489+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR)
    })
    List<RoleDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212589+08:00", comments="Source Table: role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212638+08:00", comments="Source Table: role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212686+08:00", comments="Source Table: role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.21273+08:00", comments="Source Table: role")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212789+08:00", comments="Source Table: role")
    default int insert(RoleDO record) {
        return MyBatis3Utils.insert(this::insert, record, roleDO, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(cname).toProperty("cname")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212873+08:00", comments="Source Table: role")
    default int insertMultiple(Collection<RoleDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, roleDO, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(cname).toProperty("cname")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.212966+08:00", comments="Source Table: role")
    default int insertSelective(RoleDO record) {
        return MyBatis3Utils.insert(this::insert, record, roleDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(cname).toPropertyWhenPresent("cname", record::getCname)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213141+08:00", comments="Source Table: role")
    default Optional<RoleDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213195+08:00", comments="Source Table: role")
    default List<RoleDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213241+08:00", comments="Source Table: role")
    default List<RoleDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213285+08:00", comments="Source Table: role")
    default Optional<RoleDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213335+08:00", comments="Source Table: role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213389+08:00", comments="Source Table: role")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(cname).equalTo(record::getCname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213474+08:00", comments="Source Table: role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(cname).equalToWhenPresent(record::getCname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213578+08:00", comments="Source Table: role")
    default int updateByPrimaryKey(RoleDO record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(cname).equalTo(record::getCname)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-30T22:22:32.213675+08:00", comments="Source Table: role")
    default int updateByPrimaryKeySelective(RoleDO record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(cname).equalToWhenPresent(record::getCname)
            .where(id, isEqualTo(record::getId))
        );
    }
}