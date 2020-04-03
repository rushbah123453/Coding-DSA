//https://mycode.prepbytes.com/coding/strings/VOWCON

/*
Let's take a simple problem. We all know what are vowels and consonants. Your task is pretty simple, given a string
        S
        , count number of vowels and consonants present in the string.
Input
2
PREPBYTES
FLY
Output
2 7
0 3

*/

package dsa.strings;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {
            String inputString = in.next();
         int vowelCount= isVowel(inputString);
         System.out.println(vowelCount+" "+(inputString.length()-vowelCount));
        }

    }

    private static int isVowel(String inputString) {

        int countVowel = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char value = inputString.charAt(i);
            char uppercaseValue = Character.toUpperCase(value);
            if (uppercaseValue == 'A' || uppercaseValue == 'E' || uppercaseValue == 'I' || uppercaseValue == 'O' || uppercaseValue == 'U')
                countVowel++;


        }
        return countVowel;

    }

}
