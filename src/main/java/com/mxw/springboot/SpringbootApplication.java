package com.mxw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context=SpringApplication.run(SpringbootApplication.class, args);
       System.out.println(context.getEnvironment().getProperty("jdbc.password"));
       System.out.println(context.getEnvironment().getProperty("jdbc.name"));
        System.out.println(context.getEnvironment().getProperty("111"));
       context.close();
    }

}
