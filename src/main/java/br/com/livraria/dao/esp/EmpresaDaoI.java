package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Autor;
import br.com.livraria.bean.Empresa;

public interface EmpresaDaoI extends JpaRepository<Empresa, Long> {

	
}
