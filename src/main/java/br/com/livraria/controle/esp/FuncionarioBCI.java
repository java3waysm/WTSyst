package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Funcionario;

public interface FuncionarioBCI {
	
	
	public void insert(Funcionario e);
	
	public void update(Funcionario e);
	
	public void delete(Funcionario e);
	
	public List<Funcionario> select();

}
