package com.gustavo.security.crud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(value = "com.gustavo.security.crud.repository.impl", considerNestedRepositories = true)
public class JpaConfig {

}
