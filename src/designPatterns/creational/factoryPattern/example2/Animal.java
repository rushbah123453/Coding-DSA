package designPatterns.creational.factoryPattern.example2;

public interface Animal {

    void eat();
}

class Duck implements Animal{

    @Override
    public void eat() {
System.out.println("Ducks food.....");
    }
}



class Tiger implements Animal{

    @Override
    public void eat() {
        System.out.println("Tigers food.....");
    }
}