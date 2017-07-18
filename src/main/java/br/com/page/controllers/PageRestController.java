package br.com.page.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.page.models.Pessoa;
import br.com.page.models.PessoaRepository;

@RestController
public class PageRestController {
	
	@Autowired
	private PessoaRepository repository;
	
	
	@RequestMapping(value="/pessoas",produces="application/json")
	@ResponseBody
	public List<Pessoa> pessoas() {

		
		List<Pessoa> pessoas = this.repository.findAll();
		
		return pessoas;
	}
	
}
