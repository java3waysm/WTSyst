package br.com.livraria.controle.esp;

import java.util.List;



public interface FabricanteBCI {
	public void insert(Fabricante fabricante);
	public void update(Fabricante fabricante);
	public void delete(Fabricante fabricante);
	public List<Fabricante> select();
	
	
}
