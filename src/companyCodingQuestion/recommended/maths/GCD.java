package companyCodingQuestion.recommended.maths;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

       System.out.println( gcd(num1,num2));
    }

    private static int gcd(int a, int b) {

        if (b==0)
            return a;

        return gcd(b,a%b);

    }
}
