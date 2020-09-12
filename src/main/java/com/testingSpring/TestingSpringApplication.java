package com.testingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author piyush kumar
 */
@SpringBootApplication
@EnableJpaAuditing
public class TestingSpringApplication {

    public static void main(String args[]){
        SpringApplication.run(TestingSpringApplication.class,args);
    }
}
