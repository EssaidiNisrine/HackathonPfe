package com.pfe.HackathonBackend.services;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.pfe.HackathonBackend.dto.RequestCompte;
import com.pfe.HackathonBackend.dto.RequestUtilisateur;
import com.pfe.HackathonBackend.entities.Compte;
import com.pfe.HackathonBackend.entities.Utilisateur;
import com.pfe.HackathonBackend.repositories.UtilisateurRepository;



@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	private ModelMapper modelMapper;
	private UtilisateurRepository utilisateurRepository;
	
	

	public UtilisateurServiceImpl(ModelMapper modelMapper, UtilisateurRepository utilisateurRepository) {
		super();
		this.modelMapper = modelMapper;
		this.utilisateurRepository = utilisateurRepository;
	}



	@Override
	public Utilisateur ajoutUtilisateur(RequestUtilisateur utilisateur) {
    	System.out.println("ajoutUtilisateur Service utilisateur");
        	RequestCompte rc=utilisateur.getCompte();
        	if(rc!=null) {
        	Compte compte=modelMapper.map(rc, Compte.class);
            Utilisateur u = modelMapper.map(utilisateur, Utilisateur.class);
            u.setCompte(compte);
            return utilisateurRepository.save(u);
        	}
        return null;
	}

}
