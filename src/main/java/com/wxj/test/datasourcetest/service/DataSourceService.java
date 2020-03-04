package com.wxj.test.datasourcetest.service;

import com.wxj.test.datasourcetest.entity.DataSourceEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * Created by wxj on 2020/3/2 0002 13:40
 */
@Component
public interface DataSourceService {
    List<DataSourceEntity> getMysqlData();

    List<DataSourceEntity> getOracleData();
}
