package com.example.PetStore.repository;

import com.example.PetStore.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends JpaRepository<product, Long> {


    //Trouver tous les produits
    List<product> findAll();
}
