package interviewPrep.designPatterns.creational.abstractFactoryPattern;

enum CarType {
    MINI, MICRO, LUXURY
}

enum Location {
    INDIA, USA, UK
}

public abstract class Car {
    private CarType model;
    private Location location;

    Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Carmodel - " + model + " location - " + location;
    }

}
