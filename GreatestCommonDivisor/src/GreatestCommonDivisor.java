public class GreatestCommonDivisor {
    public static void main(String [] args){
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int divisor=0;
        if(first<10 || second<10){
            return -1;
        }else{
            for(int i=1; i<=second; i++){
                if(first%i==0 && second%i==0){
                    divisor=i;
                }
            }
            return divisor;
        }
    }
}
