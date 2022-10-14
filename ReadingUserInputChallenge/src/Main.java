import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int count=1;
        while(count<=10){
            System.out.println("Enter number #"+ count + ":");
            if(scan.hasNextInt()){
                int number = scan.nextInt();
                count++;
                sum = sum+number;
            }else{
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        scan.close();
        System.out.println("The sum of the given numbers is "+ sum);
    }
}