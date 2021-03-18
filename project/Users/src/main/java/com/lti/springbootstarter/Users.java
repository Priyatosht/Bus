package com.lti.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.lti"})
@EntityScan(basePackages = "com.lti")
public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Users.class, args);

	}

}
