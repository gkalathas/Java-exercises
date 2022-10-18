import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Player tim = new Player("Tim", 10, 15);
        tim.setWeapon("Darkeness Greatsword");
        System.out.println(tim);
        ISaveable werewolf = new Monster("Werewolf", 30, 40);
        ((Monster)werewolf).getStrength();//because we declare it as an interface so first we need to cast it.
        System.out.println(werewolf);
        saveObject(werewolf);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "2 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String string = scan.nextLine();
                    values.add(index, string);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}