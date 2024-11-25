package com.example.spring_boot_microservice_3_api_gateway.controller;

import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;
import com.example.spring_boot_microservice_3_api_gateway.service.AuthenticationService;
import com.example.spring_boot_microservice_3_api_gateway.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private AuthenticationService authenticationService;
    private UserService userService;

    public AuthController(AuthenticationService authenticationService, UserService userService) {
        this.authenticationService = authenticationService;
        this.userService = userService;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody UserEntity user) {
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody UserEntity user) {
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            return new ResponseEntity<>("Username is already taken", HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
}
