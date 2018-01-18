package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Cachorro;
import br.com.livraria.controle.esp.CachorroBCI;
import br.com.livraria.dao.esp.CachorroDaoI;

@Controller
public class CachorroBC implements CachorroBCI {

	@Autowired
	private CachorroDaoI dao; 
	
	
	@Override
	public void insert(Cachorro c) {
		dao.save(c);

	}

	@Override
	public void delete(Cachorro c) {
		dao.delete(c);

	}

	@Override
	public void update(Cachorro c) {
		dao.save(c);

	}

	@Override
	public List<Cachorro> select() {
		return dao.findAll();
	}

}
