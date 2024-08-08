package com.gabriel.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.gabriel.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
