package com.example.spring_boot_microservice_3_api_gateway.entity;

import com.example.spring_boot_microservice_3_api_gateway.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "fecha_creacion", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "token")
    @Transient
    private String token;
}
