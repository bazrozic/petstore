package com.example.PetStore.repository;

import com.example.PetStore.model.cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface catRepository extends JpaRepository<cat, Long> {

    //Trouver tous les chats
    List<cat> findAll();
}
