package com.pfe.HackathonBackend.controllers;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.HackathonBackend.dto.RequestUtilisateur;
import com.pfe.HackathonBackend.entities.Utilisateur;
import com.pfe.HackathonBackend.services.UtilisateurService;


@RestController
@RequestMapping(path = "utilisateurs")
public class UtilisateurController {
  private UtilisateurService utilisateurService;

public UtilisateurController(UtilisateurService utilisateurService) {
	super();
	this.utilisateurService = utilisateurService;
}
   @PostMapping
  public ResponseEntity<Utilisateur> ajoutUtilisateur(@RequestBody RequestUtilisateur requestUtilisateur) {
	return new ResponseEntity<>(utilisateurService.ajoutUtilisateur(requestUtilisateur),HttpStatus.CREATED);	
  }
}
