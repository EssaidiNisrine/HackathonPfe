package com.pfe.HackathonBackend.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.pfe.HackathonBackend.dto.RequestEtapes;
import com.pfe.HackathonBackend.dto.RequestIngredientsRecette;
import com.pfe.HackathonBackend.dto.RequestRecette;
import com.pfe.HackathonBackend.entities.Etape;
import com.pfe.HackathonBackend.entities.Ingredient;
import com.pfe.HackathonBackend.entities.IngredientRecette;
import com.pfe.HackathonBackend.entities.Recette;
import com.pfe.HackathonBackend.entities.Utilisateur;
import com.pfe.HackathonBackend.repositories.EtapeRepository;
import com.pfe.HackathonBackend.repositories.IngedientRepository;
import com.pfe.HackathonBackend.repositories.RecetteRepository;
import com.pfe.HackathonBackend.repositories.UtilisateurRepository;

@Service
public class RecetteServiceImp implements RecetteService{
	private ModelMapper modelMapper;
    private RecetteRepository recetteRepository;
    private UtilisateurRepository utilisateurRepository;
    private EtapeRepository etapeRepository;
    private IngedientRepository ingedientRepository;

	public RecetteServiceImp(ModelMapper modelMapper, RecetteRepository recetteRepository,
			UtilisateurRepository utilisateurRepository, EtapeRepository etapeRepository,
			IngedientRepository ingedientRepository) {
		super();
		this.modelMapper = modelMapper;
		this.recetteRepository = recetteRepository;
		this.utilisateurRepository = utilisateurRepository;
		this.etapeRepository = etapeRepository;
		this.ingedientRepository = ingedientRepository;
	}

	@Override
	public Recette ajoutRecette(RequestRecette recette) {
	    Optional<Utilisateur> u = utilisateurRepository.findById(recette.getIdUtilisateur());
	    List<RequestIngredientsRecette> rir=recette.getIngredientsRecette();
	    List<RequestEtapes> re=recette.getRecetteEtapes();
	    if(rir!=null && re!=null && u.isPresent()) {
	    	 Recette nouvelleRecette = new Recette();
	         nouvelleRecette.setUtilisateur(u.get());
	    	for(RequestEtapes retape: re ) {
	    		Optional<Etape> etape = etapeRepository.findById(retape.getIdEtape());
	    		if(etape.isPresent()) {
	    			nouvelleRecette.getEtapes().add(etape.get());
	    		}
	    	}
	    	 	
	    }
		return null;
	}

	@Override
	public List<Recette> getAllRecette() {
		// TODO Auto-generated method stub
		return recetteRepository.findAll();
	}

	@Override
	public List<Recette> getAllRecetteUtilisateur(int id) {
		Optional<Utilisateur> utilisateur=utilisateurRepository.findById(id);
		if(utilisateur.isPresent()) {
			return recetteRepository.findByUtilisateur(utilisateur.get());
		}
		return null;
		
	}

	@Override
	public Recette getRecette(int id) {
        Optional<Recette> recette = recetteRepository.findById(id);
        if (recette.isPresent()) {
            return recette.get();
        }
        return null;
	}

	@Override
	public void deleteRecette(int id) {
	    Optional<Recette> recette= recetteRepository.findById(id);  
	    if(!recette.isEmpty()) recetteRepository.delete(recette.get());
		
	}

	@Override
	public Recette updateRecette(RequestRecette recette, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
