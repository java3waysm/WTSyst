package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Viagem;
import br.com.livraria.controle.esp.ViagemBCI;
import br.com.livraria.dao.esp.ViagemDaoI;

@Controller
public class ViagemBC implements ViagemBCI {
	
	@Autowired
	private ViagemDaoI dao;

	@Override
	public void insert(Viagem e) {
		dao.save(e);
	}

	@Override
	public void update(Viagem e) {
		dao.save(e);
	}

	@Override
	public void delete(Viagem e) {
		dao.delete(e);
	}

	@Override
	public List<Viagem> select() {
		return dao.findAll();
	}

}
