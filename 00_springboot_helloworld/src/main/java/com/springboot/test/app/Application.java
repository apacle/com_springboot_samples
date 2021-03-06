package com.springboot.test.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.seatelgroup"})
@MapperScan("com.seatelgroup.learn.sql")
public class Application {

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
}
