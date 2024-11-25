package com.example.microservice_2_compra.controller;

import com.example.microservice_2_compra.entity.CompraEntity;
import com.example.microservice_2_compra.service.CompraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compra")
public class CompraController {
    private CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping
    // Implementar los métodos de la API REST
    public ResponseEntity<?> saveCompra(@RequestBody CompraEntity compra) {
        return new ResponseEntity<>(compraService.saveCompra(compra), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> findAllComprasOfUser(@PathVariable("userId") Long userId) {
        return new ResponseEntity<>(compraService.findAllComprasOfUser(userId), HttpStatus.OK);
    }

}
