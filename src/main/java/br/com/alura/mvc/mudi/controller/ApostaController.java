package br.com.alura.mvc.mudi.controller;


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
		humanoTeste.setEmail("aaaaaaaaa@aaaaaa");
		humanoTeste.setNome("aaaaaaaa");
		
		humanoRepository.save(humanoTeste);
		
		Aposta apostaTeste = new Aposta();
		apostaTeste.setNumeros(2222222);
		apostaTeste.setHumano(humanoTeste);
		
		apostaRepository.save(apostaTeste);
		
		return "TU APOSTOU MIZERAVEL";
	}
	
	
}
