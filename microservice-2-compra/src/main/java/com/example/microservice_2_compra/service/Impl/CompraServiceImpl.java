package com.example.microservice_2_compra.service.Impl;

import com.example.microservice_2_compra.entity.CompraEntity;
import com.example.microservice_2_compra.repository.CompraRepository;
import com.example.microservice_2_compra.service.CompraService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {
    private CompraRepository compraRepository;

    public CompraServiceImpl(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public CompraEntity saveCompra(CompraEntity compra) {
        return compraRepository.save(compra);
    }

    @Override
    public List<CompraEntity> findAllComprasOfUser(Long userId) {
        return compraRepository.findByUserId(userId);
    }
}
