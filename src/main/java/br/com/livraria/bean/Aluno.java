package br.com.livraria.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Aluno {

	
	/*
	 * 
	 * comitando
	 * teste
	 * 
	 * */
	@Id
	private Integer id;
	
	@ManyToMany(mappedBy = "alunos")
	private List<Curso> cursos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
}
