package com.patternexample;

/**
 * Created by Administrator on 9/29/2017.
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    Animal getKindOfAnimals(String typeAnimal) {
        if (typeAnimal.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (typeAnimal.equalsIgnoreCase("Rabbit")) {
            return new Rabbit();
        }
        return null;
    }

    @Override
    Plant getKindOfPlants(String typePlant) {
        return null;
    }
}
