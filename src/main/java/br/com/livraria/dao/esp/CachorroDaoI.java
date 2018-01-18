package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Cachorro;

public interface CachorroDaoI extends JpaRepository<Cachorro, Long> {

}
