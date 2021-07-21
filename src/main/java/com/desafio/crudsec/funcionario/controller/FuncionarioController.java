package com.desafio.crudsec.funcionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.crudsec.funcionario.model.Funcionario;
import com.desafio.crudsec.funcionario.repo.FuncionarioRepository;

@RestController
@RequestMapping(value="/api")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcionarioRepository ;
	
	@GetMapping("/funcionarios")
	public List<Funcionario> listaProdutos(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/funcionario/{id}")
	public Funcionario listaProduto(@PathVariable(value="id") long id){
		return funcionarioRepository.findById(id);
	}
	
}
