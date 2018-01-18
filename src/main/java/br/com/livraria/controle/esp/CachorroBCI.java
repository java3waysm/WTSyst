package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Cachorro;

public interface CachorroBCI {
	
	public void insert(Cachorro c);

	public void delete(Cachorro c);

	public void update(Cachorro c);
	
	public List<Cachorro> select();
}
