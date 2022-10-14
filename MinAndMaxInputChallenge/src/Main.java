import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int minimum=2147483647;//Integer.MAX_VALUE;
        int maximum=-2147483648;//Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number:");
            if(scan.hasNextInt()){
                int number = scan.nextInt();
                if(number>maximum){
                    maximum=number;
                }
                if(number<minimum){
                    minimum=number;
                }
            }else{
                break;
            }
            scan.nextLine();
        }
        scan.close();
        System.out.println("Maximum value = "+ maximum + " and Minimum value = "+ minimum);
    }
}