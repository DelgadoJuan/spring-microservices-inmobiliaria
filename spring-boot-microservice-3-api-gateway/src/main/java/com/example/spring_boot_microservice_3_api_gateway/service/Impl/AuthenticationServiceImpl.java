package com.example.spring_boot_microservice_3_api_gateway.service.Impl;

import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;
import com.example.spring_boot_microservice_3_api_gateway.security.UserPrincipal;
import com.example.spring_boot_microservice_3_api_gateway.security.jwt.JwtProvider;
import com.example.spring_boot_microservice_3_api_gateway.service.AuthenticationService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private AuthenticationManager authenticationManager;
    private JwtProvider jwtProvider;

    public AuthenticationServiceImpl(AuthenticationManager authenticationManager, JwtProvider jwtProvider) {
        this.authenticationManager = authenticationManager;
        this.jwtProvider = jwtProvider;
    }

    @Override
    public UserEntity signInAndReturnJWT(UserEntity signInRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword())
        );
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userPrincipal);
        UserEntity userEntity = userPrincipal.getUser();
        userEntity.setToken(jwt);
        return userEntity;
    }
}
