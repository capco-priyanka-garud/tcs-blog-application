package com.tcs.blog.config;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Data
@RequiredArgsConstructor
@Configuration
public class BeanConfig {

    private final Environment environment;

}
