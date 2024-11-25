package com.example.spring_boot_microservice_3_api_gateway.service.Impl;

import com.example.spring_boot_microservice_3_api_gateway.Enum.Role;
import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;
import com.example.spring_boot_microservice_3_api_gateway.repository.UserRepository;
import com.example.spring_boot_microservice_3_api_gateway.security.jwt.JwtProvider;
import com.example.spring_boot_microservice_3_api_gateway.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private JwtProvider jwtProvider;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtProvider jwtProvider) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtProvider = jwtProvider;
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        UserEntity userCreated = userRepository.save(user);
        userCreated.setToken(jwtProvider.generateToken(userCreated));

        return userCreated;
    }

    @Override
    public Optional<UserEntity> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void updateUserRole(String username, Role role) {
        userRepository.updateUserRole(username, role);
    }
}
