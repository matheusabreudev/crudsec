package com.desafio.crudsec.funcionario.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.crudsec.funcionario.model.Funcionario;
import com.desafio.crudsec.produto.model.Produto;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	Funcionario findById(long id);
}
