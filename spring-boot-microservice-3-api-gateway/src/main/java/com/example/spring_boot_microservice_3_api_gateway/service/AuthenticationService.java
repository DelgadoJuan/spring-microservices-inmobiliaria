package com.example.spring_boot_microservice_3_api_gateway.service;

import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;

public interface AuthenticationService {
    UserEntity signInAndReturnJWT(UserEntity signInRequest);
}
