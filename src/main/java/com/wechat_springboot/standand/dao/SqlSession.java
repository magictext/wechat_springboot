package com.wechat_springboot.standand.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import java.beans.PropertyVetoException;
import javax.sql.DataSource;


public class SqlSession {
    @Value("${spring.datasource.driverClassName}")
    private String jdbcDriverClass;

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.user}")
    private String jdbcUser;

    @Value("${spring.datasource.password}")
    private String jdbcPwd;

    @Bean(name="dataSource")
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(jdbcPwd);
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
