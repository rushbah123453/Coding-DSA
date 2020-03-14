//https://mycode.prepbytes.com/coding/strings/LOVEA

package strings;

import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int testCases=in.nextInt();

        for (int j=0;j<testCases;j++) {

            String inputString = in.next();
            int countA=0;
            for (int i=0;i<inputString.length();i++){
                if(inputString.charAt(i)=='a'){
                    countA++;
                }
            }

            if ((inputString.length()/2)>=countA){
System.out.println(2*countA-1);
            }else{
                System.out.println(inputString.length());
            }


        }
    }
}
