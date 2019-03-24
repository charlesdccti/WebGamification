package com.ita.charles.WebGamification.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private Integer	id;
	private String 	name;
	private String 	login;
	private String 	password;
	private Integer qtdPoints;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getQtdPoints() {
		return qtdPoints;
	}
	public void setQtdPoints(Integer qtdPoints) {
		this.qtdPoints = qtdPoints;
	}
	
	
	

}
