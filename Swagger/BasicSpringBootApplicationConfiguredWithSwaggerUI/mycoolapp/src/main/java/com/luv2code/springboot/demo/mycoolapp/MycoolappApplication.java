package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
