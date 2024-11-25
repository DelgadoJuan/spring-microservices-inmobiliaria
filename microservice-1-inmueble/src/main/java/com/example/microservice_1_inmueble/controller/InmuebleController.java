package com.example.microservice_1_inmueble.controller;

import com.example.microservice_1_inmueble.entity.Inmueble;
import com.example.microservice_1_inmueble.service.InmuebleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inmueble")
public class InmuebleController {
    private final InmuebleService inmuebleService;

    public InmuebleController(InmuebleService inmuebleService) {
        this.inmuebleService = inmuebleService;
    }

    // Methods
    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble) {
        return new ResponseEntity<>(inmuebleService.saveInmueble(inmueble), HttpStatus.CREATED);
    }

    @DeleteMapping("/{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable("inmuebleId") Long inmuebleId) {
        inmuebleService.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<?> findAllInmuebles() {
        return new ResponseEntity<>(inmuebleService.findAllInmuebles(), HttpStatus.OK);
    }
}
