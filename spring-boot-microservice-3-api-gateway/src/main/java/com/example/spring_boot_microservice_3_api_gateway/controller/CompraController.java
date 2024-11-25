package com.example.spring_boot_microservice_3_api_gateway.controller;

import com.example.spring_boot_microservice_3_api_gateway.request.CompraServiceRequest;
import com.example.spring_boot_microservice_3_api_gateway.security.UserPrincipal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gateway/compra")
public class CompraController {
    private CompraServiceRequest compraServiceRequest;

    public CompraController(CompraServiceRequest compraServiceRequest) {
        this.compraServiceRequest = compraServiceRequest;
    }

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Object requestBody) {
        return new ResponseEntity<>(compraServiceRequest.saveCompra(requestBody), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllComprasOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return new ResponseEntity<>(compraServiceRequest.getAllCompras(userPrincipal.getId()), HttpStatus.OK);
    }
}
