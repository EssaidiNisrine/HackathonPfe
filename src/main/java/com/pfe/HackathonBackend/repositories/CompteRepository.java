package com.pfe.HackathonBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.HackathonBackend.entities.Compte;
@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {

}
