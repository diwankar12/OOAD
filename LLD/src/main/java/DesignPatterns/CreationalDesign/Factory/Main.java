package DesignPatterns.CreationalDesign.Factory;

public class Main {
    public static void main(String[] args) {
//        Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);
//        cat.eat();
//        Animal lion = AnimalFactory.getAnimal(AnimalType.LION);
//        lion.eat();
        AnimalFactory cat = new AnimalFactory(new Cat());
        cat.getAnimal();

    }
}
