package br.com.alura.mvc.mudi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDAPOSTA")
	private long id;
	
	@Column(name = "NUMEROS")
	private long numeros;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HUMANO_IDHUMANO")
	private Humano humano;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		id = id;
	}

	public long getNumeros() {
		return numeros;
	}

	public void setNumeros(long numeros) {
		this.numeros = numeros;
	}
	
	
	
}
