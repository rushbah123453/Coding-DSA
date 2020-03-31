package designPatterns.creational.factoryPattern.example2;

public class AnimalFactory {


    public Animal getAnimal(String animal){
        switch (animal){
            case "Tiger":return new Tiger();
            case "Duck":return new Duck();
            default:return null;
        }
    }
}
