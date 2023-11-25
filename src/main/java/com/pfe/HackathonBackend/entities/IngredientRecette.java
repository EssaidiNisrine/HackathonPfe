package com.pfe.HackathonBackend.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="IngredientsRecette")
public class IngredientRecette implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom", nullable = false)
	private String quantite;  
	
	@ManyToOne
	private Ingredient ingredient;
	
	@ManyToOne
	private Recette recette;
	
public IngredientRecette() {
	// TODO Auto-generated constructor stub
}

public IngredientRecette(int id, String quantite, Ingredient ingredient, Recette recette) {
	super();
	this.id = id;
	this.quantite = quantite;
	this.ingredient = ingredient;
	this.recette = recette;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getQuantite() {
	return quantite;
}

public void setQuantite(String quantite) {
	this.quantite = quantite;
}

public Ingredient getIngredient() {
	return ingredient;
}

public void setIngredient(Ingredient ingredient) {
	this.ingredient = ingredient;
}

public Recette getRecette() {
	return recette;
}

public void setRecette(Recette recette) {
	this.recette = recette;
}
    
}
