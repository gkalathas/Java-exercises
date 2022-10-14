public class LastDigitChecker {
    public static void main(String [] args){
        System.out.println(hasSameLastDigit(32,44,42));

    }
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber<10 || secondNumber<10 || thirdNumber<10 || firstNumber>1000 || secondNumber>1000 || thirdNumber>1000){
            return false;
        }else{
            int firstLastDigit = firstNumber%10;
            int secondLastDigit = secondNumber%10;
            int thirdLastDigit = thirdNumber%10;
            if(firstLastDigit==secondLastDigit|| firstLastDigit==thirdLastDigit || secondLastDigit==thirdLastDigit){
                return true;
            }
                return false;
        }
    }
    public static boolean isValid(int number){
        if(number>=10 && number<=1000){
            return true;
        }
        return false;
    }
}
