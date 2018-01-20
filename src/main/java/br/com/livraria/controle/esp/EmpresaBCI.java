package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Empresa;

public interface EmpresaBCI {
	
	
	public void insert(Empresa e);
	
	public void update(Empresa e);
	
	public void delete(Empresa e);
	
	public List<Empresa> select();

}
