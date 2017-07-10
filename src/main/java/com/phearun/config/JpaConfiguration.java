package com.phearun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.phearun.repository"})
public class JpaConfiguration {

}
