package com.pfe.HackathonBackend.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Recettes")
public class Recette implements Serializable{
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Recette;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name="dureePreparation" , nullable = false)
	private int dureePreparation;
	
	@Column(name = "photo")
	private String photo;
	
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy = "recette",fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
	@JsonBackReference
	private ArrayList<IngredientRecette> ingredientsRecette ;
	
	 @ManyToMany
	    @JoinTable(name = "EtapesRecette", 
	               joinColumns = @JoinColumn(name = "id_Recette"), 
	               inverseJoinColumns = @JoinColumn(name = "id_Etape"))
	    private List<Etape> etapes;
	
	public Recette() {
		// TODO Auto-generated constructor stub
	}

	public Recette(int id, String nom, int dureePreparation, String photo) {
		super();
		this.id_Recette = id;
		this.nom = nom;
		this.dureePreparation = dureePreparation;
		this.photo = photo;
	}

	public int getId() {
		return id_Recette;
	}

	public void setId(int id) {
		this.id_Recette = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDureePreparation() {
		return dureePreparation;
	}

	public void setDureePreparation(int dureePreparation) {
		this.dureePreparation = dureePreparation;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getId_Recette() {
		return id_Recette;
	}

	public void setId_Recette(int id_Recette) {
		this.id_Recette = id_Recette;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ArrayList<IngredientRecette> getIngredientsRecette() {
		return ingredientsRecette;
	}

	public void setIngredientsRecette(ArrayList<IngredientRecette> ingredientsRecette) {
		this.ingredientsRecette = ingredientsRecette;
	}

	public List<Etape> getEtapes() {
		return etapes;
	}

	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}
	
}
