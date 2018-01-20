package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Empresa;
import br.com.livraria.controle.esp.EmpresaBCI;
import br.com.livraria.dao.esp.EmpresaDaoI;

@Controller
public class EmpresaBC implements EmpresaBCI {
	
	@Autowired
	private EmpresaDaoI dao;

	@Override
	public void insert(Empresa e) {
		dao.save(e);
	}

	@Override
	public void update(Empresa e) {
		dao.save(e);
	}

	@Override
	public void delete(Empresa e) {
		dao.delete(e);
	}

	@Override
	public List<Empresa> select() {
		return dao.findAll();
	}

}
