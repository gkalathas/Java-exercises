public class NumberToWords {
    public static void main(String [] args){
        System.out.println(reverse(1234));
        numberToWords(129);
        System.out.println(getDigitCount(90));

    }
    public static void numberToWords(int number){
        int lastDigit=0;
        int total=0;
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            while(number!=0){
                lastDigit=number%10;
                number=number/10;
                total = (total*10)+lastDigit;
            }
            System.out.println(total);
            System.out.println(reverse(total));
            while(total!=0){
                int count=total%10;
                total= total/10;
                switch (count) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
            }
        }
    }
    public static int reverse(int numberToReverse){
        int firstDigit;
        int total=0;
        while(numberToReverse!=0){
            firstDigit=numberToReverse%10;
            total =(total*10)+firstDigit;
            numberToReverse = numberToReverse/10;
        }
        return total;
    }
    public static int getDigitCount(int  number){
        int count = 0;
        int digit;
        if(number<0){
            return -1;
        }else{
            while(number!=0){
                number=number/10;
                count++;
            }
            return count;
        }
    }
}
