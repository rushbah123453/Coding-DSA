/*
https://mycode.prepbytes.com/coding/strings/NOBVOW

        Noble Vowel
        Given a string
        S
        your task is to find out whether a string is Noble Vowel string or not. A Nobel Vowel string is one in which there has to be a vowel after every consonant, but there can be any letter after any vowel. The only exception is a consonant
        n
        ; after this letter, there can be any letter (not only a vowel) or there can be no letter at all.

*/


package dsa.strings;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();
        for (int j=0;j<testCases;j++) {
            String inputString = in.next();
            boolean flag=true;

            if(inputString.length()==1){
                char value=Character.toUpperCase(inputString.charAt(0));
                if(value=='N' || !isConsonant(value)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                for (int i=0;i<inputString.length()-1;i++){

                    char value=inputString.charAt(i);
                    char uppercaseValue = Character.toUpperCase(value);
                    boolean isConsonant=isConsonant(uppercaseValue);

                    if (isConsonant &&  Character.toUpperCase(inputString.charAt(i))!='N'){
                        if (isConsonant(inputString.charAt(i+1))){
                            flag=false;
                            break;
                        }

                    }else if (isConsonant(inputString.charAt(i+1)) && i==inputString.length()-2 &&  Character.toUpperCase(inputString.charAt(i+1))!='N'){
                        flag=false;
                        break;
                    }
                }

                if (flag){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }}

    }

    private static boolean isConsonant(char value) {
        char uppercaseValue = Character.toUpperCase(value);
        if (uppercaseValue == 'A' || uppercaseValue == 'E' || uppercaseValue == 'I' || uppercaseValue == 'O' || uppercaseValue == 'U')
            return false;
        else
            return true;
    }


}
