package com.example.spring_boot_microservice_3_api_gateway.configuration;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {
    public static void loadEnv() {
        Dotenv dotenv = Dotenv.configure().load();

        String springDatasourceUrl = dotenv.get("DB_URL");
        String springDatasourceUsername = dotenv.get("DB_USER");
        String springDatasourcePassword = dotenv.get("DB_PASSWORD");
        String jwtSecret = dotenv.get("JWT_SECRET");
        String secureKeyUsername = dotenv.get("SECURE_KEY_USERNAME");
        String secureKeyPassword = dotenv.get("SECURE_KEY_PASSWORD");

        System.setProperty("spring.datasource.url", springDatasourceUrl);
        System.setProperty("spring.datasource.username", springDatasourceUsername);
        System.setProperty("spring.datasource.password", springDatasourcePassword);
        System.setProperty("jwt.secret", jwtSecret);
        System.setProperty("service.security.secure-key-username", secureKeyUsername);
        System.setProperty("service.security.secure-key-password", secureKeyPassword);
    }
}
