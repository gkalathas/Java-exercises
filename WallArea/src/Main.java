public class Main {
    public static void main(String[] args){
        Wall wall = new Wall(-1.25, -1.25);
        System.out.println(wall.getAreaWithoutAnyParameters());
        wall.setHeight(-1.5);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getAreaWithoutAnyParameters());
    }
}