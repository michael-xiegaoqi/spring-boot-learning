package com.gjjf.commonservice.userCenter.config;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan("com.gjjf.commonservice.userCenter.dao")
@EnableConfigurationProperties(DataSourceProperties.class)
@EnableTransactionManagement
public class MybatisDataSource {

	// mybaits mapper xml搜索路径
    private final static String MAPPERLOCATIONS = "classpath:/mybatis/*/*.xml";
    private final static String CONFIGLOCATION = "classpath:/mybatis-config.xml";

    @Autowired
    private DataSourceProperties dataSourceProperties;
    
    private DruidDataSource datasource = null;

    @Bean(destroyMethod = "close")
    public  DataSource dataSource(){
        datasource = new DruidDataSource();  
        datasource.setUrl(dataSourceProperties.getUrl());
        datasource.setDbType(dataSourceProperties.getType());
        datasource.setDriverClassName(dataSourceProperties.getDriver());
        datasource.setUsername(dataSourceProperties.getUsername());
        datasource.setPassword(dataSourceProperties.getPassword());
        return datasource;
    }

    @PreDestroy
    public void close() {
        if(datasource != null){
            datasource.close();
        }
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(MAPPERLOCATIONS));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(CONFIGLOCATION));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.phz.test.spring.cloud.demo.entity");
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
	
}
