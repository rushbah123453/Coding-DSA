//https://mycode.prepbytes.com/coding/strings/ANTDAN

package dsa.strings;

import java.util.Scanner;

public class Problem1 {




    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int testCases=in.nextInt();

        for (int j=0;j<testCases;j++) {
            int countA=0,countD=0;
            long lengthofString = in.nextLong();
            String inputString = in.next();
            for (int i = 0; i < inputString.length(); i++) {
                char value = inputString.charAt(i);
                if (value == 'A')
                    countA++;
                else if (value == 'D')
                    countD++;

            }
            if (countA > countD)
                System.out.println("Aditya");
            else if (countA < countD)
                System.out.println("Danish");
            else
                System.out.println("AdiDan");
        }

    }


}
