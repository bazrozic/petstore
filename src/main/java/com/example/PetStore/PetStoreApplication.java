package com.example.PetStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.PetStore.repository.*;
import com.example.PetStore.model.*;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PetStoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
	}

	// Déclaration des repositories
	private final animalRepository animalRepository;
	private final addressRepository addressRepository;
	private final catRepository catRepository;
	private final fishRepository fishRepository;
	private final petStoreRepository petStoreRepository;
	private final productRepository productRepository;

	// Injection des dépendances via le constructeur
	@Autowired
	public PetStoreApplication(animalRepository animalRepository, addressRepository addressRepository, catRepository catRepository, fishRepository fishRepository, petStoreRepository petStoreRepository, productRepository productRepository) {
		this.animalRepository = animalRepository;
		this.addressRepository = addressRepository;
		this.catRepository = catRepository;
		this.fishRepository = fishRepository;
		this.petStoreRepository = petStoreRepository;
		this.productRepository = productRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// Création et sauvegarde des adresses
		address address1 = new address("1", "Les bandes du gaffres", "Redon", "35600");
		address address2 = new address("2", "rue de la pax", "Paris", "75000");
		address address3 = new address("3", "rue duchesse anne", "Nantes", "35000");
		addressRepository.save(address1);
		addressRepository.save(address2);
		addressRepository.save(address3);

		// Création et sauvegarde des magasins d'animaux
		petStore petStore1 = new petStore("Animalove", "Pierre Jacques", address1);
		petStore petStore2 = new petStore("Au Z’animo", "Paul Jacques", address2);
		petStore petStore3 = new petStore("Les Potes à Poils", "Jack Jacques", address3);
		petStoreRepository.save(petStore1);
		petStoreRepository.save(petStore2);
		petStoreRepository.save(petStore3);

		// Création et sauvegarde des produits
		product product1 = new product("Croquettes pour chat", "Croquettes pour chat qui déboite", ProdType.FOOD, 15.0, petStore1);
		product product2 = new product("Jeu pour chien", "Jeu pour chien qui s'éclate", ProdType.ACCESSORY, 8.0, petStore2);
		product product3 = new product("Pelle a litière", "Pelle a litière", ProdType.CLEANING, 4.0, petStore3);
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);

		// Création et sauvegarde des animaux
		animal animal1 = new animal(new Date(), "Noir", petStore1);
		animal animal2 = new animal(new Date(), "Blanc", petStore2);
		animal animal3 = new animal(new Date(), "Marron", petStore2);
		animalRepository.save(animal1);
		animalRepository.save(animal2);
		animalRepository.save(animal3);

		// Création et sauvegarde des poissons
		fish fish1 = new fish(new Date(), "Bleu", petStore1, FishLivEnv.SEA_WATER);
		fish fish2 = new fish(new Date(), "Violet", petStore1, FishLivEnv.SEA_WATER);
		fish fish3 = new fish(new Date(), "Rouge", petStore2, FishLivEnv.FRESH_WATER);
		fishRepository.save(fish1);
		fishRepository.save(fish2);
		fishRepository.save(fish3);

		// Création et sauvegarde des chats
		cat cat1 = new cat(new Date(), "Blanc", petStore1, "1");
		cat cat2 = new cat(new Date(), "Noir", petStore2, "2");
		cat cat3 = new cat(new Date(), "Gris", petStore3, "3");
		catRepository.save(cat1);
		catRepository.save(cat2);
		catRepository.save(cat3);

		// Récupération et affichage des animaux du premier magasin
		List<animal> animauxPetStore1 = animalRepository.findByPetStoreId(petStore1.getId());
		System.out.println("Animaux du petStore1 : " + animauxPetStore1);

		// Affichage de toutes les adresses (a décommenter pour voir le résultat)
		//System.out.println("toutes les addresses : " + addressRepository.findAll());

		// Affichage de tous les magasins d'animaux (a décommenter pour voir le résultat)
		//System.out.println("tous les petStores : " + petStoreRepository.findAll());

		// Affichage de tous les produits (a décommenter pour voir le résultat)
		//System.out.println("tous les produits : " + productRepository.findAll());

		// Affichage de tous les animaux (a décommenter pour voir le résultat)
		//System.out.println("tous les animaux : " + animalRepository.findAll());

		// Affichage de tous les chats (a décommenter pour voir le résultat)
		//System.out.println("tous les chats : " + catRepository.findAll());

		// Affichage de tous les poissons (a décommenter pour voir le résultat)
		//System.out.println("tous les poissons : " + fishRepository.findAll());
	}
}