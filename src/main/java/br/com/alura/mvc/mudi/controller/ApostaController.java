package br.com.alura.mvc.mudi.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.model.Aposta;
import br.com.alura.mvc.mudi.model.Humano;
import br.com.alura.mvc.mudi.repository.ApostaRepository;
import br.com.alura.mvc.mudi.repository.HumanoRepository;

@RestController
public class ApostaController {

	@Autowired
	private ApostaRepository apostaRepository;
	
	@Autowired
	private HumanoRepository humanoRepository;

	@RequestMapping("/aposta")
	public String aposta() {
		
		Humano humanoTeste = new Humano();
		humanoTeste.setEmail("NilsonFabio@gmail.com");
		humanoTeste.setNome("Nilson 2");
		
 		List<Aposta> listaApostas = new ArrayList<>();
 		
 		Aposta apostaTeste = new Aposta();
		apostaTeste.setNumeros(2222222);		
		apostaTeste.setHumano(humanoTeste);
		
		Aposta apostaTeste2 = new Aposta();
		apostaTeste2.setNumeros(333333333);
		apostaTeste2.setHumano(humanoTeste);
		
		
		listaApostas.add(apostaTeste);
 		listaApostas.add(apostaTeste2);
		
		humanoTeste.setApostas(listaApostas);
		
		
		
		humanoRepository.save(humanoTeste);
		
		
		
		return "TU APOSTOU MIZERAVEL";
	}
	
	
}
