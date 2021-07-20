package com.desafio.crudsec.funcionario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.crudsec.funcionario.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
