package com.pfe.HackathonBackend.services;

import java.util.List;

import com.pfe.HackathonBackend.entities.Ingredient;


public interface IngredientService {
    public List<Ingredient> getAllIngredients();
    public Ingredient getIngredientById(int id);
    public Ingredient ajoutIngredient(Ingredient ing);
    public Ingredient updateProduit(Ingredient ing,int id);
    public void deleteIngredient(int id);

}
