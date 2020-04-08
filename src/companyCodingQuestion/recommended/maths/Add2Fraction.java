//https://www.geeksforgeeks.org/program-to-add-two-fractions/
package companyCodingQuestion.recommended.maths;

import java.util.Scanner;

public class Add2Fraction {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int den1=scanner.nextInt();
        int num2=scanner.nextInt();
        int den2=scanner.nextInt();

        System.out.print(num1+"/"+den1+" + "+num2+"/"+den2);

        addFraction(num1,den1,num2,den2);
    }

    private static void addFraction(int num1, int den1, int num2, int den2) {

        int gcdOfden1den2=gcd(den1,den2);
        int den3=(den1*den2)/gcdOfden1den2;

        int num3=(num1*(den3/den1))+(num2*(den3/den2));

        lowestFraction(num3,den3);




    }

    private static void lowestFraction(int num3, int den3) {

        int commonFactor=gcd(num3,den3);

        int num4=num3/commonFactor;
        int den4=den3/commonFactor;

        System.out.print(" = "+num4+"/"+den4);


    }

    private static int gcd(int a,int b){

        if (b==0)
            return a;

        return gcd(b,a%b);
    }


}
