package com.example.microservice_1_inmueble.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "inmueble")
@NoArgsConstructor
@AllArgsConstructor
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;
    @Column(name = "direccion", length = 500, nullable = false)
    private String direccion;
    @Column(name = "foto", length = 1200)
    private String foto;
    @Column(name = "precio", nullable = false)
    private Double precio;
    @Column(name = "fecha_creacion", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
}
