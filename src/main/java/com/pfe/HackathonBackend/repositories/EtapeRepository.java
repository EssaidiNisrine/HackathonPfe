package com.pfe.HackathonBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.HackathonBackend.entities.Etape;


@Repository
public interface EtapeRepository  extends JpaRepository<Etape, Integer>{

}
