
//https://mycode.prepbytes.com/contest/PREPINTRA/problems/ADDDG
package contest.PrepbyteIntra;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int testCases=in.nextInt();

        for (int j=0;j<testCases;j++) {
            String inputString = in.next();
            printAnswer(inputString,inputString.length());
        }
    }

    private static void printAnswer(String inputString, int length) {
int sum=0;
        for (int i=0;i<length;i++){
            if(Character.isDigit(inputString.charAt(i))){
                sum+=Character.getNumericValue(inputString.charAt(i));
            }
        }
        System.out.println(sum%length);

    }
}
