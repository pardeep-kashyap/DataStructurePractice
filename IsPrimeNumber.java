import java.util.Scanner;

public class IsPrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers to be checked prime :- ");
        int numberOFCount = sc.nextInt();
        for(int i=0;i<numberOFCount;i++){
            System.out.println("Enter Number to be checked :- ");
            int randomNumber = sc.nextInt();
            int countOFDivision=0;
            for(int j=2;j*j<=randomNumber;j++){
                if(randomNumber%j == 0){
                    countOFDivision++;
                    break;
                }
            }

            if(countOFDivision == 0){
                System.out.println("Number is Prime");
            }else{
                System.out.println("Number is not Prime");
            }
        }
    }
}