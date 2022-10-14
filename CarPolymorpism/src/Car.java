public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car-> startEngine";
    }
    public String accelerate(){
        return "Car-> accelerate()";
    }
    public String brake(){
        return "Car-> brake()";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi ->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi ->accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi-> brake()";
    }

}


class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden ->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden ->accelerate()";
    }

    @Override
    public String brake() {
        return "Holden-> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford ->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford ->accelerate()";
    }

    @Override
    public String brake() {
        return "Ford-> brake()";
    }
}
