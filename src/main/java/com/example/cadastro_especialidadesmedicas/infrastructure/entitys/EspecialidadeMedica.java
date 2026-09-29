package com.example.cadastro_especialidadesmedicas.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "EspecialidadesMedicas")
@Entity
public class EspecialidadeMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column(name = "nome")
    private  String nome;

    @Column(name = "email", unique = true)
    private  String email;

    @Column(name = "senha", unique = true)
    private  String senha;

    @Column(name = "login", unique = true)
    private  String login;

    @Column(name = "especialidade")
    private  String especialidade;

}
