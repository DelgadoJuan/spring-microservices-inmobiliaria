package com.example.spring_boot_microservice_3_api_gateway.service;

import com.example.spring_boot_microservice_3_api_gateway.Enum.Role;
import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    UserEntity saveUser(UserEntity user);

    Optional<UserEntity> findByUsername(String username);

    void updateUserRole(String username, Role role);
}
