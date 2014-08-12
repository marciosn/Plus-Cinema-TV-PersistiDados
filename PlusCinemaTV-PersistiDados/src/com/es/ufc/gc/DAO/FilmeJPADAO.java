package com.es.ufc.gc.DAO;

import com.es.ufc.gc.model.Filme;

public class FilmeJPADAO extends GenericJPADAO<Filme> implements FilmeDAO{
	public FilmeJPADAO(){
		this.persistentClass = Filme.class;
	}
}
