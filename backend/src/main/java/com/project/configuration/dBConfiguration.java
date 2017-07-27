package com.project.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.project.model.*;

@Configuration
@EnableTransactionManagement 
@ComponentScan(basePackages="com.project.backend")
public class dBConfiguration {
	@Bean
	public DataSource getDataSource() {
		BasicDataSource datasource=new BasicDataSource();
		try{
		//BasicDataSource datasource=new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
	    datasource.setUrl("jdbc:h2:tcp://localhost/~/project");
	    datasource.setUsername("project");
	    datasource.setPassword("project");
	    System.out.println("datasource");
		}catch(Exception e){
			System.out.println("OUT1");
			System.out.println(e);
			System.out.println("OUT2");
		}
	    return datasource;
	}
	@Autowired
	@Bean
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setPackagesToScan(new String[]{"com.project.backend.model"});
		
		return sessionFactory;
		
	}
	
	
	public Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return properties;
		
	}
	
	@Autowired
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		
		return transactionManager;
	}
}
