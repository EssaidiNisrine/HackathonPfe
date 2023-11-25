package com.pfe.HackathonBackend.dto;

public class RequestIngredientsRecette {
    private String quantiteProduit;


    private int idIngredient;  
    public RequestIngredientsRecette() {
		// TODO Auto-generated constructor stub
	}
    
    public RequestIngredientsRecette(String quantiteProduit, int idIngredient) {
		super();
		this.quantiteProduit = quantiteProduit;
		this.idIngredient = idIngredient;
	}

	public String getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(String quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }
}
