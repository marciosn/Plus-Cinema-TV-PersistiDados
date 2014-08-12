package com.es.ufc.gc.controll;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.es.ufc.gc.DAO.FilmeJPADAO;
import com.es.ufc.gc.DAO.SerieJPADAO;
import com.es.ufc.gc.model.Filme;
import com.es.ufc.gc.model.Serie;

@ManagedBean
public class ControleBean {
	private Filme filme = new Filme();
	private Filme filme2 = new Filme();
	private Serie serie = new Serie();
	private Serie serie2 = new Serie();
	private FilmeJPADAO filmeDAO = new FilmeJPADAO();
	private SerieJPADAO serieDAO = new SerieJPADAO();
	private List<Filme> filmes = new ArrayList<Filme>();
	private List<Serie> series = new ArrayList<Serie>();
	
	public String cadastraFilme(){
		try {
			filmeDAO.beginTransaction();
			filmeDAO.save(filme);
			filmeDAO.commit();
		} catch (Exception e) {
			filmeDAO.rollback();
			e.printStackTrace();
		} finally{
			filmeDAO.close();
		}
		return "/paginas/Lista_filmes?faces-redirect=true";
	}
	public String cadastraSerie(){
		try {
			serieDAO.beginTransaction();
			serieDAO.save(serie);
			serieDAO.commit();
		} catch (Exception e) {
			serieDAO.rollback();
			e.printStackTrace();
		} finally{
			serieDAO.close();
		}
		return "/paginas/Lista_serie?faces-redirect=true";
	}
	public List<Filme> getFilmeBanco(){
		List<Filme> filmes = filmeDAO.find();
		return filmes;
	}
	public List<Serie> getSerieBanco(){
		List<Serie> series = serieDAO.find();
		return series;
	}
	public String Deleta(){
		try {
		filmeDAO.beginTransaction();
		filmeDAO.delete(this.filme);
		filmeDAO.commit();
		
	} catch (Exception e) {
		filmeDAO.rollback();
		e.printStackTrace();
	}finally{
		filmeDAO.close();
	}
	return "/paginas/Lista_filmes?faces-redirect=true";
}
	public String DeletaSerie(){
		try {
		serieDAO.beginTransaction();
		serieDAO.delete(this.serie);
		serieDAO.commit();
		
	} catch (Exception e) {
		serieDAO.rollback();
		e.printStackTrace();
	}finally{
		serieDAO.close();
	}
	return "/paginas/Lista_serie?faces-redirect=true";
}
	public String Edita(){
		
		try {
			filmeDAO.beginTransaction();
			filmeDAO.save(this.filme2);
			filmeDAO.commit();
		} catch (Exception e) {
			filmeDAO.rollback();
			e.printStackTrace();
		}finally{
			filmeDAO.close();
		}
		
		return "/paginas/Lista_filmes?faces-redirect=true";	
	}
public String EditaSerie(){
		
		try {
			serieDAO.beginTransaction();
			serieDAO.save(this.serie2);
			serieDAO.commit();
		} catch (Exception e) {
			serieDAO.rollback();
			e.printStackTrace();
		}finally{
			serieDAO.close();
		}
		
		return "/paginas/Lista_serie?faces-redirect=true";	
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public List<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	public List<Serie> getSeries() {
		return series;
	}
	public void setSeries(List<Serie> series) {
		this.series = series;
	}
	public Filme getFilme2() {
		return filme2;
	}
	public void setFilme2(Filme filme2) {
		this.filme2 = filme2;
	}
	public Serie getSerie2() {
		return serie2;
	}
	public void setSerie2(Serie serie2) {
		this.serie2 = serie2;
	}
}
