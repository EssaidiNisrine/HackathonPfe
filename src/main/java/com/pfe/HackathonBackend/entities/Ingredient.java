package com.pfe.HackathonBackend.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Ingredients")
public class Ingredient  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@OneToMany(mappedBy = "ingredient",fetch = FetchType.LAZY ,cascade = CascadeType.REMOVE)
	@JsonBackReference
	private List<IngredientRecette> infredientsRecette;
	
	public Ingredient() {
		// TODO Auto-generated constructor stub
	}



	public Ingredient(int id, String nom, ArrayList<IngredientRecette> infredientsRecette) {
		super();
		this.id = id;
		this.nom = nom;
		this.infredientsRecette = infredientsRecette;
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
	
}
