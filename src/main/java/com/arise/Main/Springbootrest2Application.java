package com.arise.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class Springbootrest2Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Springbootrest2Application.class, args);
	}

}
