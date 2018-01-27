package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Viagem;

public interface ViagemBCI {
	
	
	public void insert(Viagem e);
	
	public void update(Viagem e);
	
	public void delete(Viagem e);
	
	public List<Viagem> select();

}
