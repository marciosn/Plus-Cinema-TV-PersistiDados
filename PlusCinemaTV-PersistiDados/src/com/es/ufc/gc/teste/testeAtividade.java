package com.es.ufc.gc.teste;

import java.util.List;

import sun.awt.HToolkit;

import com.es.ufc.gc.DAO.TarefaJPADAO;
import com.es.ufc.gc.model.Tarefa;

public class testeAtividade{
	public static void main(String[] args) {
		TarefaJPADAO tarefaDAO = new TarefaJPADAO();
		List<Tarefa> lista = tarefaDAO.find();
		
		for(Tarefa t: lista){
			System.out.println("ID: " + t.getId());
			System.out.println("Assunto: " + t.getAssunto());
			System.out.println("Descricao: " + t.getDescricao());
			
		}
		tarefaDAO.close();
	}

}
