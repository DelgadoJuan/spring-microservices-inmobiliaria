package com.example.spring_boot_microservice_5_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootMicroservice5ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice5ConfigServerApplication.class, args);
	}

}
