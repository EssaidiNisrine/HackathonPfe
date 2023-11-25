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

import com.pfe.HackathonBackend.entities.Etape;
import com.pfe.HackathonBackend.entities.Ingredient;
import com.pfe.HackathonBackend.services.EtapeService;
import com.pfe.HackathonBackend.services.IngredientService;

@RestController
@RequestMapping(path = "etapes")
public class EtapeController {
  private EtapeService etapeService;

public EtapeController(EtapeService etapeService) {
	super();
	this.etapeService = etapeService;
}

@GetMapping()
 public ResponseEntity<List<Etape>> getAllEtape(){
	return new ResponseEntity<>(etapeService.getAllEtapes(),HttpStatus.OK);	 
 }
@GetMapping(path = "/{id}")
public ResponseEntity<Etape> getEtapeById(@PathVariable int id){
	return new ResponseEntity<>(etapeService.getEtapeById(id),HttpStatus.OK);
}

@PostMapping
  public ResponseEntity<Etape> ajoutEtape(@RequestBody Etape etape) {
	return new ResponseEntity<>(etapeService.ajoutEtape(etape),HttpStatus.CREATED);	
  }

@DeleteMapping(path = "/{id}")
public ResponseEntity<?> deleteEtape(@PathVariable int id) {
	etapeService.deleteEtape(id);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
@PutMapping(path = "/{id}")
public ResponseEntity<Etape>  updateClient(@RequestBody Etape etape, @PathVariable int id) {
	return new ResponseEntity<>(etapeService.updateEtape(etape, id),HttpStatus.ACCEPTED);
	
}
}
