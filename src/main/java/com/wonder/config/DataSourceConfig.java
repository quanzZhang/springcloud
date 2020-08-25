package com.wonder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "dbOne")
    @ConfigurationProperties(prefix = "spring.datasource.one")
    @Primary
    DataSource dataSourceOne(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "dbTwo")
    @ConfigurationProperties(prefix = "spring.datasource.two")
    DataSource dataSourceTwo(){
        return DataSourceBuilder.create().build();
    }

}
