package designPatterns.creational.factoryPattern.example1;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape1=shapeFactory.getShape("Rectangle");// here creation of Rectangle object is abstracted in ShapeFactory
        shape1.draw();

        Shape shape2=shapeFactory.getShape("Circle");// here creation of Circle object is abstracted in ShapeFactory
        shape2.draw();

        Shape shape3=shapeFactory.getShape("Square");// here creation of Square object is abstracted in ShapeFactory
        shape3.draw();


    }
}
