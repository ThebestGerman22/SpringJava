package com.example.cadastro_especialidadesmedicas.infrastructure.repository;

import com.example.cadastro_especialidadesmedicas.infrastructure.entitys.EspecialidadeMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface EspecialidadeMedicaRepository extends JpaRepository<EspecialidadeMedica, Integer> {

    Optional<EspecialidadeMedica> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}