package com.pfe.HackathonBackend.entities;

import java.io.Serializable;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comptes")
public class Compte implements Serializable {
	@Id
	private String username;
	
	@Column
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	
	@OneToOne(mappedBy = "compte",cascade = {CascadeType.REMOVE},fetch = FetchType.LAZY)
	private Utilisateur utilisateur;
	public Compte() {
		// TODO Auto-generated constructor stub
	}
	public Compte(String username, String password, Utilisateur utilisateur) {
		super();
		this.username = username;
		this.password = password;
		this.utilisateur = utilisateur;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
