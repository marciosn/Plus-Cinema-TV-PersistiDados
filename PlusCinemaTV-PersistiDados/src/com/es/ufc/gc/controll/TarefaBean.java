package com.es.ufc.gc.controll;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

import com.es.ufc.gc.DAO.TarefaJPADAO;
import com.es.ufc.gc.model.Tarefa;

@ManagedBean
public class TarefaBean {
	
	private Tarefa tarefa = new Tarefa();
	private Tarefa tarefa2 = new Tarefa();
	private TarefaJPADAO tarefaDAO = new TarefaJPADAO();
	private List<Tarefa> tarefas = new ArrayList<Tarefa>();
	
	@ManagedProperty(value="#{repositorio}")
	private Repositorio repositorio;
	
	/*public TarefaBean(){
		this.tarefa = new Tarefa();
		this.tarefa2 = new Tarefa();
	}*/
	
	public String Nova_Tarefa(){

		try {
			tarefaDAO.beginTransaction();
			tarefaDAO.save(tarefa);
			tarefaDAO.commit();
			
		} catch (Exception e) {
			tarefaDAO.rollback();
			e.printStackTrace();
		}finally{
			tarefaDAO.close();
		}
		
		
		return "/paginas/Lista_tarefas?faces-redirect=true";
		
	}

	public List<Tarefa> getTarefaBanco(){
		List<Tarefa> tarefas = tarefaDAO.find();
		return tarefas;
	}
	
	
	public String Edita_Tarefa(){
		
		try {
			tarefaDAO.beginTransaction();
			tarefaDAO.save(this.tarefa2);
			tarefaDAO.commit();
		} catch (Exception e) {
			tarefaDAO.rollback();
			e.printStackTrace();
		}finally{
			tarefaDAO.close();
		}
		
		return "/paginas/Lista_tarefas?faces-redirect=true";	
	}
	
	public String Deleta_Tarefa(){
			try {
			tarefaDAO.beginTransaction();
			tarefaDAO.delete(this.tarefa);
			tarefaDAO.commit();
			
		} catch (Exception e) {
			tarefaDAO.rollback();
			e.printStackTrace();
		}finally{
			tarefaDAO.close();
		}
		
		return "/paginas/Lista_tarefas?faces-redirect=true";
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Tarefa getTarefa2() {
		return tarefa2;
	}

	public void setTarefa2(Tarefa tarefa2) {
		this.tarefa2 = tarefa2;
	}

	public Repositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(Repositorio repositorio) {
		this.repositorio = repositorio;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	

}
