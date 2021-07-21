package com.desafio.crudsec.produto.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "produtoEntityManagerFactory", transactionManagerRef = "produtoTransactionManager")
@Profile("produto")
public class produtoDBConfig {

	@Bean(name = "produtoDatasouce")
	@ConfigurationProperties(prefix = "spring.produto.datasource")
	public DataSource datasource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "produtoEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
			@Qualifier("produtoDatasource") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.desafio.crudsec.produto.repo")
				.persistenceUnit("Produto")
				.build();
	}

	@Bean(name = "produtoTransactionManager")
	public PlatformTransactionManager transactionManager(@Qualifier("produtoEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
