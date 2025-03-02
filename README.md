# Petstore

## Description

Le projet **Petstore** est une application de gestion d'un magasin d'animaux utilisant **Spring Boot** et **JPA**. Il permet de gérer l'inventaire des animaux, les addresses, ainsi que les produits vendus. L'application utilise une base de données **MariaDB** pour stocker toutes les informations et s'appuie sur **Maven** pour la gestion des dépendances.

## Auteur

**Basile Rozic**

## Prérequis

Avant de commencer, vous devez avoir installé les outils suivants sur votre machine :

- **Java 17** ou une version supérieure
- **Maven**
- **MariaDB** (utilisé comme base de données pour le projet)

## Installation

1. Clonez le repository :

   ```bash
   git clone https://github.com/bazrozic/petstore.git
   ```

2. Accédez au répertoire du projet :

   ```bash
   cd petstore
   ```

3. Assurez-vous d'avoir Java 17 installé en vérifiant avec la commande suivante :

   ```bash
   java -version
   ```

   Si ce n'est pas le cas, installez Java 17.

4. Vérifiez que Maven est installé avec cette commande :

   ```bash
   mvn -version
   ```

5. Configurez votre base de données **MariaDB** :

   - Créez une base de données, par exemple `petstore`.
   - Modifiez le fichier `application.properties` pour y insérer vos informations de connexion à la base de données :

     ```properties
     spring.datasource.url=jdbc:mariadb://localhost:3306/petstore
     spring.datasource.username=votre_utilisateur
     spring.datasource.password=votre_mot_de_passe
     spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
     spring.jpa.hibernate.ddl-auto=update
     ```

6. Installez les dépendances avec Maven :

   ```bash
   mvn clean install
   ```

7. Lancez l'application avec la commande suivante :

   ```bash
   mvn spring-boot:run
   ```

