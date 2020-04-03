package interviewPrep.designPatterns.creational.factoryPattern.example1;

public class ShapeFactory {

    public Shape getShape(String shape){
        switch (shape){
            case "Rectangle": return new Rectangle();
            case "Circle": return new Circle();
            case "Square": return new Square();
            default:return null;
        }

    }
}
