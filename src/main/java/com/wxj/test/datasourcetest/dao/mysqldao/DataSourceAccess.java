package com.wxj.test.datasourcetest.dao.mysqldao;

import com.wxj.test.datasourcetest.entity.DataSourceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * Created by wxj on 2020/3/3 0003 15:13
 */
@Mapper
@Repository

public interface DataSourceAccess {

    List<DataSourceEntity> getMysqlData();


}
