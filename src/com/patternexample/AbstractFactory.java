package com.patternexample;

/**
 * Created by Administrator on 9/29/2017.
 */
public abstract class AbstractFactory {
    abstract Animal getKindOfAnimals(String typeAnimal);

    abstract Plant getKindOfPlants(String typePlant);
}
