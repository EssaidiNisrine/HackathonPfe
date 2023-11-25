package com.pfe.HackathonBackend.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Utilisateurs")
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "prenom",nullable = false)
	private String prenom;
	
	@Column(name = "dateNaissance",nullable = false)
	private Date dateNaissance;
	
	@Transient
	private int age;
	
	@Column(name = "email",nullable = false,unique = true)
	private String email;
	
	@Column(name = "adresse",nullable = false)
	private String adresse;
	
	@Column(name="telephone")
	private String telephone;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
	@JsonBackReference
	private Compte compte;
	
	@OneToMany(mappedBy = "utilisateur",fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JsonBackReference
	private ArrayList<Recette> recettes;
	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(int id, String nom, String prenom, Date dateNaissance, String email, String adresse,
			String telephone, Compte compte) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.compte = compte;
	}

	public int getAge() {
	    // Calculer l'âge à partir de la date de naissance (supposons que dateNaissance est une date valide)
	    if (dateNaissance != null) {
	        long ageInMillis = new Date().getTime() - dateNaissance.getTime();
	        age = (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365)); // Convertir les millisecondes en années
	    }
	    return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
}
