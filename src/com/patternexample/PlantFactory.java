package com.patternexample;

/**
 * Created by Administrator on 9/29/2017.
 */
public class PlantFactory extends AbstractFactory {
    @Override
    Animal getKindOfAnimals(String typeAnimal) {
        return null;
    }

    @Override
    Plant getKindOfPlants(String typePlant) {
        if (typePlant.equalsIgnoreCase("Flower")) {
            return new Flower();
        } else if (typePlant.equalsIgnoreCase("Grass")) {
            return new Grass();
        } else if (typePlant.equalsIgnoreCase("Tree")) {
            return new Tree();
        }
        return null;
    }
}
