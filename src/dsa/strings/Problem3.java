/*https://mycode.prepbytes.com/coding/strings/DESCSTR

        Input
        2

        prepbytes
        algorithm

        Output
        ytsrppeeb
        tromlihga

*/


package dsa.strings;


import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {

            String inputString = in.next();
            String stringOutput= sortString(inputString);
            System.out.println(stringOutput);
        }

    }

    private static String sortString(String inputString) {

        char[] character=inputString.toCharArray();
        char temp;

        for (int i=0;i<inputString.length()-1;i++){
            for (int j=i+1;j<inputString.length();j++){
                if (character[j]>character[i]){
                    temp=character[j];
                    character[j]=character[i];
                    character[i]=temp;
                }
            }
        }
        return String.valueOf(character);
    }

}
