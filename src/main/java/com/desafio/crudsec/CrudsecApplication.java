package com.desafio.crudsec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.crudsec.funcionario.repo.FuncionarioRepository;
import com.desafio.crudsec.produto.repo.ProdutoRepository;

@SpringBootApplication
public class CrudsecApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CrudsecApplication.class, args);
	}

}
