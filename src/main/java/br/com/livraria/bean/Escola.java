package br.com.livraria.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Escola {

	@Id
	private Integer id;
	@OneToMany(targetEntity = Curso.class, mappedBy = "escola", fetch = FetchType.LAZY)
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
