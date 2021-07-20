package com.desafio.crudsec.produto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.crudsec.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);
	
}
