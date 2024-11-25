package com.example.spring_boot_microservice_3_api_gateway.controller;

import com.example.spring_boot_microservice_3_api_gateway.Enum.Role;
import com.example.spring_boot_microservice_3_api_gateway.security.UserPrincipal;
import com.example.spring_boot_microservice_3_api_gateway.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PatchMapping("/updateRole/{role}")
    public ResponseEntity<?> updateRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable("role") Role role) {
        userService.updateUserRole(userPrincipal.getUsername(), role);
        return new ResponseEntity<>("Rol cambiado", HttpStatus.OK);
    }
}
