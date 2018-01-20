package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Emprestimo;
import br.com.livraria.bean.Funcionario;
import br.com.livraria.controle.esp.FuncionarioBCI;
import br.com.livraria.dao.esp.EmprestimoDaoI;
import br.com.livraria.dao.esp.FuncionarioDaoI;

@Controller
public class FuncionarioBC implements FuncionarioBCI{

	@Autowired
	private FuncionarioDaoI dao;
	
	@Override
	public void insert(Funcionario e) {
		dao.save(e);		
	}

	@Override
	public void update(Funcionario e) {
		dao.save(e);
	}

	@Override
	public void delete(Funcionario e) {
		dao.delete(e);
		
	}

	@Override
	public List<Funcionario> select() {
		return dao.findAll();
	}
	
	
}
