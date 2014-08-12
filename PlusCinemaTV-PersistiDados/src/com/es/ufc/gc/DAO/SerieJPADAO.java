package com.es.ufc.gc.DAO;

import com.es.ufc.gc.model.Serie;

public class SerieJPADAO extends GenericJPADAO<Serie> implements SerieDAO{
	public SerieJPADAO(){
		this.persistentClass = Serie.class;
	}
}
