package com.pfe.HackathonBackend.services;

import java.util.List;

import com.pfe.HackathonBackend.entities.Etape;


public interface EtapeService {
    public List<Etape> getAllEtapes();
    public Etape getEtapeById(int id);
    public Etape ajoutEtape(Etape etape);
    public Etape updateEtape(Etape etape,int id);
    public void deleteEtape(int id);
}
