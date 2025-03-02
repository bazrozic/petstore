package com.example.PetStore.repository;

import com.example.PetStore.model.address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface addressRepository extends JpaRepository<address, Long> {

    //Trouver toutes les adresses
    List<address>findAll();
}
