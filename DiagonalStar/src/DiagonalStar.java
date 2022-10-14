public class DiagonalStar {
    public static void main(String [] args){
        printSquareStar(8);
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }else{
            int first;
            int second;
            for(first=1; first<=number; first++){
                for(second=1; second<=number; second++){
                    if(first==1 || first==number || second==1 || second==number || first==second || second==(number-first+1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
