package com.markus.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.markus.model.Receita;
import com.markus.service.ReceitaService;

@Controller
public class ReceitaController {
	
	@Autowired
	private ReceitaService receitaService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		Receita receita = new Receita();
		map.put("receita", receita);
		map.put("receitaList", receitaService.getAllReceitas());
		return "receita";
	}
	
	@RequestMapping(value="/receita.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Receita receita, BindingResult result, @RequestParam String action, Map<String, Object> map) {
		Receita receitaResult = new Receita();
		switch(action.toLowerCase()) {
		case"add":
			receitaService.add(receita);
			receitaResult = receita;
			break;
		case"edit":
			receitaService.edit(receita);
			receitaResult = receita;
			break;
		case"delete":
			receitaService.delete(receita.getId());
			receitaResult = new Receita();
			break;
		case"search":
			Receita searchedReceita = receitaService.getReceita(receita.getId());
			receitaResult = searchedReceita!=null ? searchedReceita : new Receita();
			break;
		}
		map.put("receita", receitaResult);
		map.put("receitaList", receitaService.getAllReceitas());
		return "receita";
	}
	
}
