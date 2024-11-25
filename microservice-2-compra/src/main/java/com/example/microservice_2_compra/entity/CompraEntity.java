package com.example.microservice_2_compra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "compra")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "inmueble_id", nullable = false)
    private Long inmuebleId;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "precio", nullable = false)
    private Double precio;
    @Column(name = "fecha_compra", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechaCompra;
}
