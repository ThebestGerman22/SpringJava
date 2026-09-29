package com.example.cadastro_especialidadesmedicas.infrastructure.repository;

import com.example.cadastro_especialidadesmedicas.infrastructure.entitys.EspecialidadeMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeMedicaRepository extends JpaRepository<EspecialidadeMedica, Integer> {
}
