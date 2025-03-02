package com.example.PetStore.repository;

import com.example.PetStore.model.petStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface petStoreRepository extends JpaRepository<petStore, Long> {


    //Trouver tous les magasins
    List<petStore> findAll();
}
