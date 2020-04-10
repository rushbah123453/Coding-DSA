//https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
package companyCodingQuestion.recommended.maths;

import java.util.Scanner;

public class JosephusCircleProblem {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();

       System.out.println( josephusCircle(n,k));
    }

    private static int josephusCircle(int n, int k) {

        if (n==1)
            return 1;

        else
            return (josephusCircle(n-1,k)+k-1)%n +1;
    }
}
