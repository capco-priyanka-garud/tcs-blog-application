package com.tcs.blog.config;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Data
@RequiredArgsConstructor
@Configuration
public class BeanConfig {

    private final Environment environment;

}
