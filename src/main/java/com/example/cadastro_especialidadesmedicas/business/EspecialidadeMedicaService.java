package com.example.cadastro_especialidadesmedicas.business;

import com.example.cadastro_especialidadesmedicas.infrastructure.entitys.EspecialidadeMedica;
import com.example.cadastro_especialidadesmedicas.infrastructure.repository.EspecialidadeMedicaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EspecialidadeMedicaService {

    private final EspecialidadeMedicaRepository repository;

    public EspecialidadeMedicaService(EspecialidadeMedicaRepository repository) {
        this.repository = repository;
    }

    // Salvar especialidade médica
    public void salvarEspecialidadeMedica(EspecialidadeMedica especialidadeMedica) {
        repository.saveAndFlush(especialidadeMedica);
    }

    // Buscar por e-mail
    public EspecialidadeMedica buscarEspecialidadeMedicaPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("E-mail não encontrado")
        );
    }

    // Deletar por e-mail
    @Transactional
    public void deletarEspecialidadeMedicaPorEmail(String email) {
        repository.deleteByEmail(email);
    }

    // Atualizar por ID mantendo os dados não informados
    public void atualizarEspecialidadeMedicaPorId(Integer id, EspecialidadeMedica especialidadeMedica) {
        EspecialidadeMedica entity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Especialidade Médica não encontrada")
        );

        EspecialidadeMedica especialidadeMedicaAtualizada = EspecialidadeMedica.builder()
                .id(entity.getId())
                .nome(especialidadeMedica.getNome() != null ? especialidadeMedica.getNome() : entity.getNome())
                .email(especialidadeMedica.getEmail() != null ? especialidadeMedica.getEmail() : entity.getEmail())
                .senha(especialidadeMedica.getSenha() != null ? especialidadeMedica.getSenha() : entity.getSenha())
                .login(especialidadeMedica.getLogin() != null ? especialidadeMedica.getLogin() : entity.getLogin())
                .especialidade(especialidadeMedica.getEspecialidade() != null ? especialidadeMedica.getEspecialidade() : entity.getEspecialidade())
                .build();

        repository.saveAndFlush(especialidadeMedicaAtualizada);
    }
}