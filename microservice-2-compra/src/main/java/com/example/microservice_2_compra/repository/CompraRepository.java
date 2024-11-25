package com.example.microservice_2_compra.repository;

import com.example.microservice_2_compra.entity.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
    List<CompraEntity> findByUserId(Long userId);
}
