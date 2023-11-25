package com.pfe.HackathonBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.HackathonBackend.entities.Ingredient;

@Repository
public interface IngedientRepository extends JpaRepository<Ingredient, Integer>{

}
