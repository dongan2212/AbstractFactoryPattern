package com.patternexample;

/**
 * Created by Administrator on 9/29/2017.
 */
public class FactoryProducer {
    public AbstractFactory getFactoryType(String factoryType) {
        if (factoryType.equalsIgnoreCase("Animal")) {
            return new AnimalFactory();
        } else if (factoryType.equalsIgnoreCase("Plant")) {
            return new PlantFactory();
        }
        return null;
    }
}
