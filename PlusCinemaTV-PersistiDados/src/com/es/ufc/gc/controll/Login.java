package com.es.ufc.gc.controll;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
public class Login implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8407893579950499418L;
	private String username;
	private String password;
	
	public Login(){
		HttpSession s = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		if(s != null){
			s.invalidate();
		}
	}
	public String loginBean(){
		HttpSession s = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		if(username.equals("admin") && password.equals("#qx2014")){
			if(s == null){
				s = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			}
			s.setAttribute("username", username);
			return "/index?faces-redirect=true";
		}else{
			if(s != null){
				s.invalidate();
			}
		}
		return "/login";
	}
	public String getNome() {
		return username;
	}
	public void setNome(String nome) {
		this.username = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
