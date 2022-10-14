import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int[] returnedArray = readIntegers(readInteger());
        int returnedInt = findMin(returnedArray);
        System.out.println("Minimum Value is "+ returnedInt);

    }
    public static int readInteger(){
        System.out.println("enter count: ");
        int count = scan.nextInt();
        scan.nextInt();
        return count;
    }
    public static int[] readIntegers(int count){

        int[] myArray = new int[count];
        for(int i=0; i< myArray.length; i++){
            System.out.println("Enter "+ count +" integer values");
            myArray[i]= scan.nextInt();
            scan.nextInt();
        }
        return myArray;
    }
    public static int findMin(int[] array){
        int minValue= Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value<minValue){
                minValue=value;
            }
        }
        return minValue;
    }

}