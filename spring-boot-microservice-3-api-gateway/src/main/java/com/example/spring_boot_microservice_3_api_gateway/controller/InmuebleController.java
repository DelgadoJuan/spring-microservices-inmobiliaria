package com.example.spring_boot_microservice_3_api_gateway.controller;

import com.example.spring_boot_microservice_3_api_gateway.request.InmuebleServiceRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gateway/inmueble")
public class InmuebleController {
    private InmuebleServiceRequest inmuebleServiceRequest;

    public InmuebleController(InmuebleServiceRequest inmuebleServiceRequest) {
        this.inmuebleServiceRequest = inmuebleServiceRequest;
    }

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Object requestBody) {
        return new ResponseEntity<>(inmuebleServiceRequest.saveInmueble(requestBody), HttpStatus.CREATED);
    }

    @DeleteMapping("/{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable("inmuebleId") Long inmuebleId) {
        inmuebleServiceRequest.deleteInmueble(inmuebleId);
        return new ResponseEntity<>("Inmueble eliminado", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllInmuebles() {
        return new ResponseEntity<>(inmuebleServiceRequest.getAllInmuebles(), HttpStatus.OK);
    }
}
