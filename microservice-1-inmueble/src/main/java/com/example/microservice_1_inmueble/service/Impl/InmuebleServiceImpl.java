package com.example.microservice_1_inmueble.service.Impl;

import com.example.microservice_1_inmueble.entity.Inmueble;
import com.example.microservice_1_inmueble.repository.InmuebleRepository;
import com.example.microservice_1_inmueble.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService {
    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    // Methods
    @Override
    public Inmueble saveInmueble(Inmueble inmueble) {
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long id) {
        inmuebleRepository.deleteById(id);
    }

    @Override
    public List<Inmueble> findAllInmuebles() {
        return inmuebleRepository.findAll();
    }
}
