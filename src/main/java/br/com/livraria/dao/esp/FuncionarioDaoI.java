package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Emprestimo;
import br.com.livraria.bean.Funcionario;

public interface FuncionarioDaoI extends JpaRepository<Funcionario, Long>{

}
