package com.es.ufc.gc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table (name = "Tarefa")
@NamedQuery (name = "Tarefa.findTarefa", query = "from Tarefa")
public class Tarefa implements Serializable{
	
	private static final long serialVersionUID = -3991257252311647201L;
	
	private static int ultimoID = 0;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String assunto;
	private String descricao;
	
	public Tarefa(){
		this.id = ultimoID++;
	}
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
