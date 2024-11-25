package com.example.microservice_2_compra;

import com.example.microservice_2_compra.configuration.EnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Microservice2CompraApplication {

	public static void main(String[] args) {
		//EnvConfig.loadEnv();
		SpringApplication.run(Microservice2CompraApplication.class, args);
	}

}
