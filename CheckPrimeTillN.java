import java.util.Scanner;

public class CheckPrimeTillN    {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers to be checked prime :- ");
        int numberOFCount = sc.nextInt();
        for(int i=0;i<numberOFCount;i++){
            int countOFDivision=0;
            for(int j=2;j*j<=i;j++){
                if(i%j == 0){
                    countOFDivision++;
                    break;
                }
            }

            if(countOFDivision == 0){
                System.out.println("Number = "+i+" is Prime");
            }else{
                System.out.println("Number = "+i+" is  Not Prime");
            }
        }
    }
}