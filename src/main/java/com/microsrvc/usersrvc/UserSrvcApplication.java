package com.microsrvc.usersrvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class UserSrvcApplication {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		SpringApplication.run(UserSrvcApplication.class, args);
	}

}
