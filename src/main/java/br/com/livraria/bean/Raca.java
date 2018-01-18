package br.com.livraria.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_raca", sequenceName = "raca_seq")
public class Raca {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_raca")
	private Integer id;
	private String nome;
	@OneToMany(targetEntity = Cachorro.class, mappedBy = "raca")
	private List<Cachorro> cachorros;
	
	
	
	public List<Cachorro> getCachorros() {
		return cachorros;
	}
	public void setCachorros(List<Cachorro> cachorros) {
		this.cachorros = cachorros;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
