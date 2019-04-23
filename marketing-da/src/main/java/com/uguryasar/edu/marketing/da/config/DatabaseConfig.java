package com.uguryasar.edu.marketing.da.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootConfiguration
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("com.uguryasar.edu.marketing")
@EntityScan("com.uguryasar.edu.marketing")
public class DatabaseConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        com.zaxxer.hikari.HikariConfig hikariConfig = new com.zaxxer.hikari.HikariConfig();
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);


        hikariConfig.setMaximumPoolSize(maxPoolSize);
        hikariConfig.setConnectionTestQuery(connectionTestQuery);
        hikariConfig.setPoolName(poolName);

        hikariConfig.addDataSourceProperty("dataSource.cachePrepStmts", cachePrepStmts);
        hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSize", prepStmtCacheSize);
        hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSqlLimit", prepStmtCacheSqlLimit);
        hikariConfig.addDataSourceProperty("dataSource.useServerPrepStmts", useServerPrepStmts);

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource;
    }

    @Value("${db.driverClassName}")
    private String driverClassName;

    @Value("${db.jdbcUrl}")
    private String jdbcUrl;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${hikari.maximumPoolSize}")
    private int maxPoolSize;

    @Value("${hikari.connectionTestQuery}")
    private String connectionTestQuery;

    @Value("${hikari.poolName}")
    private String poolName;

    @Value("${hikari.datasource.property.cachePrepStmts}")
    private String cachePrepStmts;

    @Value("${hikari.datasource.property.prepStmtCacheSize}")
    private String prepStmtCacheSize;

    @Value("${hikari.datasource.property.prepStmtCacheSqlLimit}")
    private String prepStmtCacheSqlLimit;

    @Value("${hikari.datasource.property.useServerPrepStmts}")
    private String useServerPrepStmts;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public void setConnectionTestQuery(String connectionTestQuery) {
        this.connectionTestQuery = connectionTestQuery;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public void setCachePrepStmts(String cachePrepStmts) {
        this.cachePrepStmts = cachePrepStmts;
    }

    public void setPrepStmtCacheSize(String prepStmtCacheSize) {
        this.prepStmtCacheSize = prepStmtCacheSize;
    }

    public void setPrepStmtCacheSqlLimit(String prepStmtCacheSqlLimit) {
        this.prepStmtCacheSqlLimit = prepStmtCacheSqlLimit;
    }

    public void setUseServerPrepStmts(String useServerPrepStmts) {
        this.useServerPrepStmts = useServerPrepStmts;
    }

}
