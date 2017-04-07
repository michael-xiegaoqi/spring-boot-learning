package com.gjjf.commonservice.userCenter.config.mysql;

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
@EnableConfigurationProperties(MysqlConfig.class)
@EnableTransactionManagement
public class MysqlFactoryConfig {

	// mybaits mapper xml搜索路径
    private final static String MAPPERLOCATIONS = "classpath:/mybatis/*/*.xml";
    
    // 数据库实体类的路径
    private String typeAliasPackage = "com.gjjf.commonservice.userCenter.model";

    @Autowired
    private MysqlConfig druidConfig;
    
    private DataSource datasource = null;
    
    @Bean(destroyMethod = "close")
	public DataSource dataSource() {	
    	datasource = druidConfig.druidDataSource();
		return datasource;
	}

    @PreDestroy
    public void close() {
        if(datasource != null){
            ((DruidDataSource) datasource).close();
        }
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(MAPPERLOCATIONS));
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    
}
