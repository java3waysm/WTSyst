package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Viagem;

public interface ViagemDaoI extends JpaRepository<Viagem, Long> {

	
}
