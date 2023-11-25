package com.pfe.HackathonBackend.services;

import com.pfe.HackathonBackend.dto.RequestUtilisateur;
import com.pfe.HackathonBackend.entities.Utilisateur;

public interface UtilisateurService {
	 public Utilisateur ajoutUtilisateur(RequestUtilisateur utilisateur);
	
}
