package com.example.microservice_1_inmueble;

import com.example.microservice_1_inmueble.configuration.EnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Microservice1InmuebleApplication {

	public static void main(String[] args) {
		//EnvConfig.loadEnv();
		SpringApplication.run(Microservice1InmuebleApplication.class, args);
	}

}
