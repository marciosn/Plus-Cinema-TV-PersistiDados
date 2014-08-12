package com.es.ufc.gc.controll;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.es.ufc.gc.model.Tarefa;

@ManagedBean
@SessionScoped
public class Repositorio {
	
	public Repositorio(){
		
	}

	List<Tarefa> tarefas = new ArrayList<Tarefa>();

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	public String insere(Tarefa t){
		tarefas.add(t);
		return "lista";
	}
}
