package com.es.ufc.gc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "Filme")
@NamedQuery (name = "Filme.findFilme", query = "from Filme")
public class Filme implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2241217790755718058L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String notaMedia;
	private String ano;
	private String genero;
	private String url;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(String notaMedia) {
		this.notaMedia = notaMedia;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
