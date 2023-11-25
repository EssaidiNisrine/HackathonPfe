package com.pfe.HackathonBackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pfe.HackathonBackend.entities.Etape;
import com.pfe.HackathonBackend.repositories.EtapeRepository;

@Service
public class EtapeServiceImp implements EtapeService{
	
	private EtapeRepository etapeRepository;

	public EtapeServiceImp(EtapeRepository etapeRepository) {
		super();
		this.etapeRepository = etapeRepository;
	}

	@Override
	public List<Etape> getAllEtapes() {
		// TODO Auto-generated method stub
		return etapeRepository.findAll();
	}

	@Override
	public Etape getEtapeById(int id) {
		Optional<Etape> etape=etapeRepository.findById(id);
		  if(!etape.isEmpty()) {
				return etape.get();
			  }		  return null;
	}

	@Override
	public Etape ajoutEtape(Etape etape) {
		// TODO Auto-generated method stub
		return etapeRepository.save(etape);
	}

	@Override
	public Etape updateEtape(Etape etape, int id) {
		Optional<Etape>  etape2=etapeRepository.findById(id);
		if(etape2.isPresent()) {
			etape.setId_Etape(etape2.get().getId_Etape());
			Etape updated=etapeRepository.save(etape);
			return updated;
		}
		return null;
	}

	@Override
	public void deleteEtape(int id) {
	    Optional<Etape> etape= etapeRepository.findById(id);  
	    if(!etape.isEmpty()) etapeRepository.delete(etape.get());
	}

}
