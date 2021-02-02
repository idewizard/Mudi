package br.com.alura.mvc.mudi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Humano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDHUMANO")
	private long id;
	
	@Column(nullable = false , name = "EMAIL")	
	private String email;
	
	@Column(name = "NOME")
	private String nome;

	@OneToMany(mappedBy = "humano")
	private List<Aposta> apostas;
	
	
	
	public List<Aposta> getApostas() {
		return apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
