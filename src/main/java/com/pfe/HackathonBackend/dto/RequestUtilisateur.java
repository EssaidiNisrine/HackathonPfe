package com.pfe.HackathonBackend.dto;

import java.util.Date;

public class RequestUtilisateur {
    private String nom;

    private String prenom;

    private Date dateNaissance;

    private String email;

    private String adresse;

    private String telephone;

    private RequestCompte compte;
    public RequestUtilisateur() {
		// TODO Auto-generated constructor stub
	}
	public RequestUtilisateur(String nom, String prenom, Date dateNaissance, String email, String adresse,
			String telephone, RequestCompte compte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.compte = compte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public RequestCompte getCompte() {
		return compte;
	}
	public void setCompte(RequestCompte compte) {
		this.compte = compte;
	}
    
}
