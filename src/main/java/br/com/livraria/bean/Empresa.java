package br.com.livraria.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name = "seq_empresa", 
sequenceName = "empresa_seq")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy 
			= GenerationType.SEQUENCE , 
			generator = "seq_empresa")
	private Integer id;
	private String razaoSocial;
	private String endereco;
	@OneToMany(targetEntity = Funcionario.class,
			mappedBy = "empresa")
	private List<Funcionario> funcionarios;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
