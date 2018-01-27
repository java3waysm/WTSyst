package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Autor;
import br.com.livraria.controle.esp.Fabricante;
import br.com.livraria.dao.esp.AutorDaoI;
	
@Controller
public class FabricanteBC implements FabricanteBCI {
	
	@Autowired
	private FabricanteDaoI dao;
	
	@Override
	public void insert(Fabricante fabricante) {
		dao.save(fabricante);
		
	}

	@Override
	public void update(Fabricante fabricante) {
		dao.save(fabricante);
		
	}

	@Override
	public void delete(Fabricante fabricante) {
		dao.delete(fabricante);
		
	}

	@Override
	public List<Fabricante> select() {
		
		return dao.findAll();
	}
	
	

}
