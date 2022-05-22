package com.springframework.pets;

/**
 * Created by Sonny on 5/22/2022.
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {

        switch (petType) {
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
