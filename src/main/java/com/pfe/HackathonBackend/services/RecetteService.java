package com.pfe.HackathonBackend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfe.HackathonBackend.dto.RequestRecette;
import com.pfe.HackathonBackend.entities.Recette;
@Service
public interface RecetteService {
	public Recette ajoutRecette(RequestRecette recette);
	public List<Recette> getAllRecette();
    public List<Recette> getAllRecetteUtilisateur(int id);
    public Recette getRecette(int id);
    public void deleteRecette(int id);
    public Recette updateRecette(RequestRecette recette,int id);
}
