import java.util.Locale;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer():steering at "+ currentDirection+ " degrees");
    }
    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicle.move: Moving at "+ currentVelocity+ " in direction "+ currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currentVelocity=0;
    }
//    private int body;
//    private int engine;
//    private int steeringWheel;
//    private int personCapacity;
//
//    public Vehicle(int body, int engine, int steeringWheel, int personCapacity) {
//        this.body = body;
//        this.engine = engine;
//        this.steeringWheel = steeringWheel;
//        this.personCapacity = personCapacity;
//    }
//    public void move(int speed){
//        if(speed>0){
//            System.out.println("The vehicle is moving");
//        }else{
//            System.out.println("The vehicle isn't moving");
//        }
//    }
//    public void steering(String direction){
//        if(direction.toLowerCase().equals("right")){
//            System.out.println("The vehicle turned right");
//        }else if(direction.toLowerCase().equals("left")){
//            System.out.println("The vehicle turned left");
//        }else{
//            System.out.println("the vehicle continue straight");
//        }
//    }
//    public int getSpeed(int speed){
//        return speed;
//    }

}
