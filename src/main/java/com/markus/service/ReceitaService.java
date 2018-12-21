package com.markus.service;

import java.util.List;

import com.markus.model.Receita;

public interface ReceitaService {

	public void add(Receita receita);
	public void edit(Receita receita);
	public void delete(int id);
	public Receita getReceita(int id);
	public List getAllReceitas();
	
}
