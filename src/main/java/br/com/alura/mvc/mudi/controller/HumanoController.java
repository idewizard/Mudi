package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.model.Humano;
import br.com.alura.mvc.mudi.repository.HumanoRepository;

@RestController
public class HumanoController {

	@Autowired
	private HumanoRepository humanoRepository;
	
	@GetMapping("/humano")
	public String ListaApostasHumano() {
		
		List<Humano> listaHumanos = humanoRepository.findAll();
		
		return String.valueOf(listaHumanos.get(0).getApostas().get(0).getNumeros());
	}
	
}
