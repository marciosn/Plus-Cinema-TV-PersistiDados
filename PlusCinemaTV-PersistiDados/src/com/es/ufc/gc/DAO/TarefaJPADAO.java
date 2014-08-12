package com.es.ufc.gc.DAO;

import com.es.ufc.gc.model.Tarefa;

public class TarefaJPADAO extends GenericJPADAO<Tarefa> implements TarefaDAO{
	
	public TarefaJPADAO(){
		this.persistentClass = Tarefa.class;
	}

}
