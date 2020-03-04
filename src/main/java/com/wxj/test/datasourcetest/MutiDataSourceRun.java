package com.wxj.test.datasourcetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = { "com.wxj.test.datasourcetest" },exclude = {DataSourceAutoConfiguration.class})
//@MapperScan(basePackages = {"com.wxj.test.datasourcetest.dao"})
public class MutiDataSourceRun {
    public static void main(String[] args) {
        SpringApplication.run(MutiDataSourceRun.class, args);
    }

}
