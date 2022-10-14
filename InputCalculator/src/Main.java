import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        double b = 0;
        while (true) {
            System.out.println("Enter a number:");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                count++;
                sum += number;
                b = sum % count;
                if (b >= 0.5) {
                    avg = (sum / count) + 1;
                } else {
                    avg = sum / count;
                }
            } else {
                break;
            }
            scan.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scan.close();
    }
}