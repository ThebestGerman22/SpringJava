package com.example.cadastro_especialidadesmedicas.business;

import com.example.cadastro_especialidadesmedicas.infrastructure.entitys.EspecialidadeMedica;
import com.example.cadastro_especialidadesmedicas.infrastructure.repository.EspecialidadeMedicaRepository;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadeMedicaService {

    private final EspecialidadeMedicaRepository repository;

    public EspecialidadeMedicaService (EspecialidadeMedicaRepository repository){
        this.repository = repository;
    }

    public void salvarEspecialidadeMedica(EspecialidadeMedica especialidademedica){
        repository.saveAndFlush(especialidademedica);
    }

    public EspecialidadeMedica buscarEspecialidadeMedicaPorEmail(String email){

    }

}
