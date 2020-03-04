package com.wxj.test.datasourcetest.dao.oracledao;

import com.wxj.test.datasourcetest.entity.DataSourceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * Created by wxj on 2020/3/4 0004 14:40
 */
@Mapper
@Repository
public interface OracleSourceAccess {

    List<DataSourceEntity> getOracleData();
}
