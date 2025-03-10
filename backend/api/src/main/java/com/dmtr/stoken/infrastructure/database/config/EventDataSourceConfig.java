package com.dmtr.stoken.infrastructure.database.config;

import com.dmtr.stoken.domain.repositories.EventRepository;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackageClasses = {
            EventRepository.class
        },
        entityManagerFactoryRef = "eventEntityManagerFactory",
        transactionManagerRef = "eventTransactionManager"
)
public class EventDataSourceConfig {

    @Bean(name = "eventDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.event")
    public DataSource eventDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "eventEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean eventEntityManagerFactory(
            @Qualifier("eventDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.dmtr.stoken.domain.events");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        return em;
    }

    @Bean(name = "eventTransactionManager")
    public PlatformTransactionManager eventTransactionManager(
            @Qualifier("eventEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
