package com.example.microservice_2_compra.service;

import com.example.microservice_2_compra.entity.CompraEntity;

import java.util.List;

public interface CompraService {
    CompraEntity saveCompra(CompraEntity compra);

    List<CompraEntity> findAllComprasOfUser(Long userId);
}
