package com.example.microservice_1_inmueble.service;

import com.example.microservice_1_inmueble.entity.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long id);

    List<Inmueble> findAllInmuebles();
}
