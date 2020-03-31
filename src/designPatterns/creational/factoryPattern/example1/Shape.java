package designPatterns.creational.factoryPattern.example1;

 public interface Shape {
     void draw();
}

class Circle implements Shape {
     @Override
    public void draw() {
         System.out.println("Drawing Circle .....");
    }
}


class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle .....");
    }
}


class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square .....");
    }
}