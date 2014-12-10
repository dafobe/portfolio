package com.dafobe.learning.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("inspect the beans provided by Spring Boot: ");
		
		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		for(String name : beans){
			System.out.println("Bean Name : " + name);
		}
	}

}
