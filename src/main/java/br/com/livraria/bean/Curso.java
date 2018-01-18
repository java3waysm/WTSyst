package br.com.livraria.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Curso {
	
	@Id
	private Integer id;
	@ManyToOne
	private Escola escola;
	
	@ManyToMany
	@JoinTable( name = "curso_aluno", 
	joinColumns = { @JoinColumn(name = "fk_curso") }, 
	inverseJoinColumns = { @JoinColumn(name = "fk_aluno") } )
	private List<Aluno> alunos;
	
	@OneToMany(targetEntity = Materia.class, mappedBy = "curso")
	private List<Materia> materias;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	
	
}







