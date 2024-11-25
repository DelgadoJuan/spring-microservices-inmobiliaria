package com.example.spring_boot_microservice_3_api_gateway.security.jwt;

import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;
import com.example.spring_boot_microservice_3_api_gateway.security.UserPrincipal;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    String generateToken(UserEntity user);

    Authentication getAuthentication(HttpServletRequest request);
    boolean isTokenValid(HttpServletRequest request);

    Claims extractClaims(HttpServletRequest request);
}
