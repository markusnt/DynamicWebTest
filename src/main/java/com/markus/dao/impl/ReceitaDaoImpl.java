package com.markus.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.markus.dao.ReceitaDao;
import com.markus.model.Receita;

@Repository
public class ReceitaDaoImpl implements ReceitaDao {

	private SessionFactory session;
	
	@Override
	public void add(Receita receita) {
		session.getCurrentSession().save(receita);
	}

	@Override
	public void edit(Receita receita) {
		session.getCurrentSession().update(receita);
	}

	@Override
	public void delete(int id) {
		session.getCurrentSession().delete(getReceita(id));
	}

	@Override
	public Receita getReceita(int id) {
		return (Receita)session.getCurrentSession().get(Receita.class, id);
	}

	@Override
	public List getAllReceitas() {
		return session.getCurrentSession().createQuery("from Receita").list();
	}

}