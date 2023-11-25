package com.pfe.HackathonBackend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.HackathonBackend.dto.RequestUtilisateur;
import com.pfe.HackathonBackend.entities.Ingredient;
import com.pfe.HackathonBackend.entities.Utilisateur;
import com.pfe.HackathonBackend.services.IngredientService;



@RestController
@RequestMapping(path = "ingredients")
public class IngredientController {
	private IngredientService ingredientService;

	public IngredientController(IngredientService ingredientService) {
		super();
		this.ingredientService = ingredientService;
	}
	
	@GetMapping()
	 public ResponseEntity<List<Ingredient>> getAllIngredients(){
		return new ResponseEntity<>(ingredientService.getAllIngredients(),HttpStatus.OK);	 
	 }
	@GetMapping(path = "/{id}")
	public ResponseEntity<Ingredient> getIngredientById(@PathVariable int id){
		return new ResponseEntity<>(ingredientService.getIngredientById(id),HttpStatus.OK);
	}
	
	@PostMapping
	  public ResponseEntity<Ingredient> ajoutIngredient(@RequestBody Ingredient ing) {
		return new ResponseEntity<>(ingredientService.ajoutIngredient(ing),HttpStatus.CREATED);	
	  }
    
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteIngredient(@PathVariable int id) {
		ingredientService.deleteIngredient(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	@PutMapping(path = "/{id}")
	public ResponseEntity<Ingredient>  updateClient(@RequestBody Ingredient ing, @PathVariable int id) {
		return new ResponseEntity<>(ingredientService.updateProduit(ing, id),HttpStatus.ACCEPTED);
		
	}
}
