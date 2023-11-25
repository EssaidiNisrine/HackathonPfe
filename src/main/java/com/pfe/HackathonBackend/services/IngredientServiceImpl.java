package com.pfe.HackathonBackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pfe.HackathonBackend.entities.Ingredient;
import com.pfe.HackathonBackend.repositories.IngedientRepository;

@Service
public class IngredientServiceImpl implements IngredientService {
    private IngedientRepository ingredientRepository;

    public IngredientServiceImpl(IngedientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient getIngredientById(int id) {
        Optional<Ingredient> ingr = ingredientRepository.findById(id);
        if (ingr.isPresent()) {
            return ingr.get();
        }
        return null;
    }

    @Override
    public Ingredient ajoutIngredient(Ingredient ing) {
        return ingredientRepository.save(ing);
    }

    @Override
    public Ingredient updateProduit(Ingredient ing, int id) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);
        if (ingredient.isPresent()) {
        	ing.setId(ingredient.get().getId());
            Ingredient updated = ingredientRepository.save(ing);
            return updated;
        }
        return null;
    }

    @Override
    public void deleteIngredient(int id) {
        Optional<Ingredient> ingr = ingredientRepository.findById(id);

        if (ingr.isPresent()) {
            ingredientRepository.delete(ingr.get());
        }
    }
}
