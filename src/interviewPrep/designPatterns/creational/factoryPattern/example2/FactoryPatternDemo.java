package interviewPrep.designPatterns.creational.factoryPattern.example2;

public class FactoryPatternDemo {


    public static void main(String[] args) {
        AnimalFactory animalFactory=new AnimalFactory();

        Animal animal1=animalFactory.getAnimal("Tiger"); // here creation of Tiger object is abstracted in animalFactory
        animal1.eat();

        Animal animal2=animalFactory.getAnimal("Duck");// here creation of Duck object is abstracted in animalFactory
        animal2.eat();
    }
}
