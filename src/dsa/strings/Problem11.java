//https://mycode.prepbytes.com/coding/strings/BALANCE

package dsa.strings;


import java.util.Scanner;

public class Problem11 {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {

            String inputString = in.next();
         int count=0,countFrequency=0;
            for (int i=0;i<inputString.length();i++){

                if (inputString.charAt(i)=='('){
                    count++;
                }else{
                    count--;
                }

                countFrequency=Math.min(count,countFrequency);


            }

            if (countFrequency>=-1 && count==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }

}
