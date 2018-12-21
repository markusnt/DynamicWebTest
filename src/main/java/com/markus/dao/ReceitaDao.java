package com.markus.dao;

import java.util.List;
import com.markus.model.Receita;

public interface ReceitaDao {

	public void add(Receita receita);
	public void edit(Receita receita);
	public void delete(int id);
	public Receita getReceita(int id);
	public List getAllReceitas();
	
}
