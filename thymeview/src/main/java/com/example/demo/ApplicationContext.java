package com.example.demo;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = {"com.Dao", "com.example.demo", "com.model", "com.tabla"})
public class ApplicationContext {
    
    
    @Bean(destroyMethod = "close")
    DataSource datasource(Environment env) {
	
	ComboPooledDataSource ds = new ComboPooledDataSource();
	
	try {
	    ds.setDriverClass(env.getProperty("jdbc.driverClassName"));
	} catch (PropertyVetoException ex) {
	    throw new RuntimeException("error while setting the driver class name in the datasource", ex);
	}																																																																																																																																					

	ds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
	ds.setUser(env.getRequiredProperty("jdbc.username"));
	ds.setPassword(env.getRequiredProperty("jdbc.password"));
	ds.setAcquireIncrement(env.getRequiredProperty("c3p0.acquire_increment", Integer.class));
	ds.setMinPoolSize(env.getRequiredProperty("c3p0.min_size", Integer.class));
	ds.setMaxPoolSize(env.getRequiredProperty("c3p0.max_size", Integer.class));
	ds.setMaxIdleTime(env.getRequiredProperty("c3p0.max_idle_time", Integer.class));
	ds.setUnreturnedConnectionTimeout(env.getRequiredProperty("c3p0.unreturned_connection_timeout", Integer.class));

	return ds;
    }
    
    @Bean
    JdbcTemplate jdbctemplate(DataSource datasource) {
	return new JdbcTemplate(datasource);
    }
    
    @Bean
    DataSourceTransactionManager dataSourceTransactionManager(DataSource datasource) {
	return new DataSourceTransactionManager(datasource);
	
    }

}
