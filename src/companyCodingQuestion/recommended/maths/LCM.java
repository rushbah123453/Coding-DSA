package companyCodingQuestion.recommended.maths;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

      System.out.println(  lcm(num1,num2));

      //Also gcdxlcm=axb
        //Therefore, lcm=(axb)/gcd
    }

    private static int lcm(int num1, int num2) {

        int lcm=num1>num2?num1:num2;

        while (true){

            if (lcm%num1==0 && lcm%num2==0){
                return lcm;
            }
            else {
                lcm++;
            }
        }


    }
}
