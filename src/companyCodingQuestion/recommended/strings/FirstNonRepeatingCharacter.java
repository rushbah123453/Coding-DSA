//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
package companyCodingQuestion.recommended.strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String inputString=scanner.next();

        getFirstNonRepeatingCharacter(inputString.toUpperCase());

    }

    private static void getFirstNonRepeatingCharacter(String inputString) {

        char[] frequencyArray=new char[256];

        for (int i=0;i<inputString.length();i++){
            frequencyArray[inputString.charAt(i)]++;
        }

        for (int i=0;i<inputString.length();i++){
            if (frequencyArray[inputString.charAt(i)]==1){
                System.out.print(inputString.charAt(i) +" is first non repeting character");
                break;
            }
        }


    }
}
