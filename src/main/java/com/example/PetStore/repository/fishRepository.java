package com.example.PetStore.repository;

import com.example.PetStore.model.fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface fishRepository extends JpaRepository<fish, Long> {

    //Trouver tous les poissons
    List<fish> findAll();
}
