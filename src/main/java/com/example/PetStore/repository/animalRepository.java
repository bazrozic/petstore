package com.example.PetStore.repository;

import com.example.PetStore.model.animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface animalRepository extends JpaRepository<animal, Long> {

    // Trouver tout les animaux par l'id du petStore
    List<animal> findByPetStoreId(Long petStoreId);

    // Trouver tout les animaux
    List<animal> findAll();
}
