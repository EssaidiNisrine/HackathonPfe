package com.pfe.HackathonBackend.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Etapes")
public class Etape implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Etape;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	 @ManyToMany
	    @JoinTable(name = "EtapesRecette", 
	               joinColumns = @JoinColumn(name = "id_Etape"), 
	               inverseJoinColumns = @JoinColumn(name = "id_Recette"))
	private List<Recette> recettes;
	 
	 public Etape() {
		// TODO Auto-generated constructor stub
	}

	public Etape(int id_Etape, String nom, List<Recette> recettes) {
		super();
		this.id_Etape = id_Etape;
		this.nom = nom;
		this.recettes = recettes;
	}

	public int getId_Etape() {
		return id_Etape;
	}

	public void setId_Etape(int id_Etape) {
		this.id_Etape = id_Etape;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Recette> getRecettes() {
		return recettes;
	}

	public void setRecettes(List<Recette> recettes) {
		this.recettes = recettes;
	}
	 
	 
}
