package com.example.spring_boot_microservice_3_api_gateway.repository;

import com.example.spring_boot_microservice_3_api_gateway.Enum.Role;
import com.example.spring_boot_microservice_3_api_gateway.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);

    @Modifying
    @Query("update UserEntity u set u.role=:role where u.username=:username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
