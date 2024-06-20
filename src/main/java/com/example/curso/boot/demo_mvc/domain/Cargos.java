package com.example.curso.boot.demo_mvc.domain;

import javax.persistence.*;

@Entity
@Table(name = "CARGOS")
public class Cargos extends AbastractEntity<Long>{
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;
}
