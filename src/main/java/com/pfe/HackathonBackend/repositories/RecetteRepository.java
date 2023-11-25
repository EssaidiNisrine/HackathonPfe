package com.pfe.HackathonBackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.HackathonBackend.entities.Recette;
import com.pfe.HackathonBackend.entities.Utilisateur;


@Repository
public interface RecetteRepository extends JpaRepository<Recette, Integer> {
	List<Recette> findByUtilisateur(Utilisateur user);
}
