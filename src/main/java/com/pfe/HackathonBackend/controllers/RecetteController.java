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

import com.pfe.HackathonBackend.dto.RequestRecette;

import com.pfe.HackathonBackend.entities.Recette;
import com.pfe.HackathonBackend.services.RecetteService;

@RestController
@RequestMapping(path = "recettes")
public class RecetteController {
    private RecetteService recetteService;

	public RecetteController(RecetteService recetteService) {
		super();
		this.recetteService = recetteService;
	}
    
	@GetMapping()
	 public ResponseEntity<List<Recette>> getAllRecettes(){
		return new ResponseEntity<>(recetteService.getAllRecette(),HttpStatus.OK);	 
	 }
	@GetMapping(path = "/{id}")
	public ResponseEntity<Recette> getRecetteById(@PathVariable int id){
		return new ResponseEntity<>(recetteService.getRecette(id),HttpStatus.OK);
	}
	
	@PostMapping
	  public ResponseEntity<Recette> ajoutRecette(@RequestBody RequestRecette recette) {
		return new ResponseEntity<>(recetteService.ajoutRecette(recette),HttpStatus.CREATED);	
	  }
   
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteRecette(@PathVariable int id) {
		recetteService.deleteRecette(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	@PutMapping(path = "/{id}")
	public ResponseEntity<Recette>  updateRecette(@RequestBody RequestRecette ing, @PathVariable int id) {
		return new ResponseEntity<>(recetteService.updateRecette(ing, id),HttpStatus.ACCEPTED);
		
	}
}
