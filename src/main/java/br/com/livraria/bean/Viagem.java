package br.com.livraria.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;





@Entity
@SequenceGenerator(name = "seq_viagem", 
sequenceName = "viagem_seq")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy 
			= GenerationType.SEQUENCE , 
			generator = "seq_viagem")

	private Integer id;
	private String destino;
	
	private List<Carro> carro;

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<Carro> getCarro() {
		return carro;
	}

	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
