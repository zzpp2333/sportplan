package com.learn.sportplan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.learn.sportplan.dao")
@SpringBootApplication
public class SportplanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportplanApplication.class, args);
	}

}
