package com.wxj.test.datasourcetest.web;

//import com.wxj.test.datasourcetest.entity.DataSourceEntity;
//import com.wxj.test.datasourcetest.service.DataSourceService;
import com.wxj.test.datasourcetest.entity.DataSourceEntity;
import com.wxj.test.datasourcetest.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Created by wxj on 2020/3/2 0002 13:30
 */

@RestController
@RequestMapping("/data")
public class DataSourceApi {

   @Autowired
   private DataSourceService dataSourceService;

    @RequestMapping("/hello")
    public String sayHello(){
       return "hello";

    }

    @GetMapping("/mysql")
    public List<DataSourceEntity> getMysqlData(){
        List<DataSourceEntity>  list = dataSourceService.getMysqlData();
        return list;

    }


    @GetMapping("/oracle")
    public List<DataSourceEntity> getOracleData(){
        List<DataSourceEntity>  list = dataSourceService.getOracleData();
        return list;

    }
}
