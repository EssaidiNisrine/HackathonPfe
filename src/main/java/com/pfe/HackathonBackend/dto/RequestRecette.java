package com.pfe.HackathonBackend.dto;

import java.util.List;

import jakarta.persistence.Column;

public class RequestRecette {
	
	private String nom;
	
	private int dureePreparation;
	
	private String photo;
	
	private int idUtilisateur;
	
	private List<RequestIngredientsRecette> ingredientsRecette;
	private List<RequestEtapes> recetteEtapes;
	
	public RequestRecette() {
		// TODO Auto-generated constructor stub
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

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public List<RequestIngredientsRecette> getIngredientsRecette() {
		return ingredientsRecette;
	}

	public void setIngredientsRecette(List<RequestIngredientsRecette> ingredientsRecette) {
		this.ingredientsRecette = ingredientsRecette;
	}

	public List<RequestEtapes> getRecetteEtapes() {
		return recetteEtapes;
	}

	public void setRecetteEtapes(List<RequestEtapes> recetteEtapes) {
		this.recetteEtapes = recetteEtapes;
	}

	public RequestRecette(String nom, int dureePreparation, String photo, int idUtilisateur,
			List<RequestIngredientsRecette> ingredientsRecette, List<RequestEtapes> recetteEtapes) {
		super();
		this.nom = nom;
		this.dureePreparation = dureePreparation;
		this.photo = photo;
		this.idUtilisateur = idUtilisateur;
		this.ingredientsRecette = ingredientsRecette;
		this.recetteEtapes = recetteEtapes;
	}


}