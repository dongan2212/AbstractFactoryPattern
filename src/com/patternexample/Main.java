package com.patternexample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int factoryTypeId;
        int animalId;
        int plantId;
        AbstractFactory abstractFactory;
        FactoryProducer factoryProducer = new FactoryProducer();
        System.out.print("Chon dong vat(1) hay thuc vat(2)?");
        Scanner sc = new Scanner(System.in);
        factoryTypeId = sc.nextInt();
        switch (factoryTypeId) {
            case 1:
                abstractFactory = factoryProducer.getFactoryType("Animal");
                System.out.print("Chon cho(1) hay tho(2)?");
                animalId = sc.nextInt();
                sc.close();
                switch (animalId) {
                    case 1:
                        Animal dog = abstractFactory.getKindOfAnimals("Dog");
                        dog.eat();
                        break;
                    case 2:
                        Animal rabbit = abstractFactory.getKindOfAnimals("Rabbit");
                        rabbit.eat();
                        break;
                }
                break;
            case 2:
                abstractFactory = factoryProducer.getFactoryType("Plant");
                System.out.print("Chon cay(1) hay hoa(2) hay co(3)?");
                plantId = sc.nextInt();
                sc.close();
                switch (plantId) {
                    case 1:
                        Plant tree = abstractFactory.getKindOfPlants("Tree");
                        tree.releaseCO2();
                        break;
                    case 2:
                        Plant flower = abstractFactory.getKindOfPlants("Flower");
                        flower.releaseCO2();
                        break;
                    case 3:
                        Plant grass = abstractFactory.getKindOfPlants("Grass");
                        grass.releaseCO2();
                        break;
                }
                break;
        }
        sc.close();
    }
}
