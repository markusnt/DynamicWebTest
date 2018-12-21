package com.markus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.markus.dao.ReceitaDao;
import com.markus.model.Receita;
import com.markus.service.ReceitaService;

@Service
public class ReceitaServiceImpl implements ReceitaService {

	@Autowired
	private ReceitaDao receitaDao;
	
	@Transactional
	public void add(Receita receita) {
		receitaDao.add(receita);
	}

	@Transactional
	public void edit(Receita receita) {
		receitaDao.edit(receita);
	}

	@Transactional
	public void delete(int id) {
		receitaDao.delete(id);
	}

	@Transactional
	public Receita getReceita(int id) {
		return receitaDao.getReceita(id);
	}

	@Transactional
	public List getAllReceitas() {
		return receitaDao.getAllReceitas();
	}

}
