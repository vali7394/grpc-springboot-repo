package com.grpc.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//Initial Application
@SpringBootApplication
public class SpringbootGrpcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGrpcServerApplication.class, args);
	}
}
