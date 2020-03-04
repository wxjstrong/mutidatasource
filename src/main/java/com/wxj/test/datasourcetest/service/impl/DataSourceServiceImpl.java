package com.wxj.test.datasourcetest.service.impl;

import com.wxj.test.datasourcetest.dao.mysqldao.DataSourceAccess;
import com.wxj.test.datasourcetest.dao.oracledao.OracleSourceAccess;
import com.wxj.test.datasourcetest.entity.DataSourceEntity;
import com.wxj.test.datasourcetest.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * Created by wxj on 2020/3/2 0002 13:41
 */
@Service
public class DataSourceServiceImpl implements DataSourceService {

   //@Autowired
    @Resource
   private DataSourceAccess dataSourceAccess;

   @Autowired
   private OracleSourceAccess oracleSourceAccess;

    @Override
    public List<DataSourceEntity> getMysqlData() {
        List<DataSourceEntity> list =dataSourceAccess.getMysqlData();
        return list;
    }

    @Override
    public List<DataSourceEntity> getOracleData() {
        List<DataSourceEntity> list =oracleSourceAccess.getOracleData();
        return list;
    }
}
