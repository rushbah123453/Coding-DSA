//https://www.geeksforgeeks.org/maximum-consecutive-repeating-character-string/
/*
Input : str = "aaaabbcbbb"
Output : a
*/
package companyCodingQuestion.recommended.strings;

import java.util.Scanner;

public class MaxRepeatingCharacter {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.next();

        printMaxRepeatingConsecutiveString(inputString);
    }

    private static void printMaxRepeatingConsecutiveString(String inputString) {

        int count=0;
        int currentCount=1;
        int index=0;
        for (int i=0;i<inputString.length()-1;i++){

            if(inputString.charAt(i)==inputString.charAt(i+1)){
                currentCount++;
            }

            else {
                if (currentCount>count){
                    count=currentCount;
                    index=i;

                }
                currentCount=1;
            }

        }

       if (count>1)
        System.out.println("The character "+inputString.charAt(index)+" is repeating "+count);
        else
           System.out.println("None of character is repeating");

    }
}
