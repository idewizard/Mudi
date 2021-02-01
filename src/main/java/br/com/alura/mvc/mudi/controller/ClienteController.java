package br.com.alura.mvc.mudi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class ClienteController {

	@GetMapping
	public String teste() {
		return "aaaaaaaaaaa";
	}
	
	
}
