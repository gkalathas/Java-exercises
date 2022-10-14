public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear=currentGear;
        System.out.println("Car.curerntGear(): Changed to "+ this.currentGear+ " gear");
    }
    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity "+ speed+ " direction "+direction);
    }

    //    private String typeOfCar;
//    private String model;
//    private int wheels;
//    private int doors;
//    private String engineType;
//
//    public Car(int steeringWheel, int personCapacity, String typeOfCar,
//               String model, int wheels, int doors, String engineType) {
//        super(1, 1, steeringWheel, personCapacity);
//        this.typeOfCar = typeOfCar;
//        this.model = model;
//        this.wheels = wheels;
//        this.doors = doors;
//        this.engineType = engineType;
//    }
//    @Override
//    public void move(int speed){
//        if(speed>60){
//            System.out.println("Car is running at "+ speed+" km/h");
//        }else if(speed>0){
//            System.out.println("car is moving slowly at "+ speed+" km/h");
//        }else{
//            System.out.println("The car isn' moving aat all");
//        }
//        public int changingGears(){
//
//        }
//
//    }
}
