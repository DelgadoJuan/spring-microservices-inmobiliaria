package com.example.spring_boot_microservice_3_api_gateway;

import com.example.spring_boot_microservice_3_api_gateway.configuration.EnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringBootMicroservice3ApiGatewayApplication {

	public static void main(String[] args) {
		//EnvConfig.loadEnv();
		SpringApplication.run(SpringBootMicroservice3ApiGatewayApplication.class, args);
	}

}
