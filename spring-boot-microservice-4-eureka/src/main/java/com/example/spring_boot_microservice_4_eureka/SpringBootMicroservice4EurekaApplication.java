package com.example.spring_boot_microservice_4_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMicroservice4EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice4EurekaApplication.class, args);
	}

}
