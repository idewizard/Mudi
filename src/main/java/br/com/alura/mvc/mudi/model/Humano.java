package br.com.alura.mvc.mudi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

	//SEM CASCADE TYPE AS ALETRAÇÕES DE UMA TABELA N VAO PARA OUTRA
	//POR PADRAO TEM QUE COLOCAR PARA MANTER A 'LIGAÇÃO' ENTRE AS TABELAS
	
	@JsonIgnoreProperties("humano")
	@OneToMany(mappedBy = "humano" , cascade = CascadeType.ALL)
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
		this.id = id;
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
