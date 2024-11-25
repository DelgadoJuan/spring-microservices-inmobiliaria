package com.example.microservice_1_inmueble.repository;

import com.example.microservice_1_inmueble.entity.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
}
