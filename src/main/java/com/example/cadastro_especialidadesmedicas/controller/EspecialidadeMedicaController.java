package com.example.cadastro_especialidadesmedicas.controller;

import com.example.cadastro_especialidadesmedicas.business.EspecialidadeMedicaService;
import com.example.cadastro_especialidadesmedicas.infrastructure.entitys.EspecialidadeMedica;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/especialidade-medica")
@RequiredArgsConstructor
public class EspecialidadeMedicaController {

    private final EspecialidadeMedicaService service;

    @PostMapping
    public ResponseEntity<Void> salvarEspecialidadeMedica(@RequestBody EspecialidadeMedica especialidadeMedica) {
        service.salvarEspecialidadeMedica(especialidadeMedica);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<EspecialidadeMedica> buscarEspecialidadeMedicaPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(service.buscarEspecialidadeMedicaPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarEspecialidadeMedicaPorEmail(@RequestParam String email) {
        service.deletarEspecialidadeMedicaPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarEspecialidadeMedicaPorId(@RequestParam Integer id, @RequestBody EspecialidadeMedica especialidadeMedica) {
        service.atualizarEspecialidadeMedicaPorId(id, especialidadeMedica);
        return ResponseEntity.ok().build();
    }
}