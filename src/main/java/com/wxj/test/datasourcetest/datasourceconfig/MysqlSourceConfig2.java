package com.wxj.test.datasourcetest.datasourceconfig;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/*
 * Created by wxj on 2020/3/4 0004 13:51
 */

@Configuration
@MapperScan(basePackages = {"com.wxj.test.datasourcetest.dao.oracledao"},sqlSessionFactoryRef ="oracleSqlSessionFactory" )
public class MysqlSourceConfig2 {
    @Bean(name="oracleSource")
    @ConfigurationProperties(prefix = "spring.datasource.d2")
    public DataSource getOracleDataSource(){
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "oracleSqlSessionFactory")
    public SqlSessionFactory oracleSqlSessionFactory(@Qualifier("oracleSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //xml位置
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/**/oraclemapper/*.xml"));
        return sqlSessionFactoryBean.getObject();

    }
    @Bean(name = "oracleSqlSessionTemplate")
    public SqlSessionTemplate oracleSqlSessionTemplate(@Qualifier("oracleSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
