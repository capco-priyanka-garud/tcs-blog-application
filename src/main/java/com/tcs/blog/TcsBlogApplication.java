package com.tcs.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.tcs.blog.model")

public class TcsBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcsBlogApplication.class, args);
    }

}
