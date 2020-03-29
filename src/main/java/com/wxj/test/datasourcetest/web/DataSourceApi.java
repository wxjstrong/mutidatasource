package com.wxj.test.datasourcetest.web;

//import com.wxj.test.datasourcetest.entity.DataSourceEntity;
//import com.wxj.test.datasourcetest.service.DataSourceService;
import com.wxj.test.datasourcetest.entity.DataSourceEntity;
import com.wxj.test.datasourcetest.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Cacheable(cacheNames = "testCache")
    @GetMapping("/mysql")
    @ResponseBody
   // public List<DataSourceEntity> getMysqlData(){
    public Map getMysqlData(){
        List<DataSourceEntity>  list = dataSourceService.getMysqlData();
        Map map = new HashMap();
        //map.put("list",list);
        map.put("test","test");
        //return list;
        return map;
    }


    @GetMapping("/oracle")
    public List<DataSourceEntity> getOracleData(){
        List<DataSourceEntity>  list = dataSourceService.getOracleData();
        return list;

    }
}
