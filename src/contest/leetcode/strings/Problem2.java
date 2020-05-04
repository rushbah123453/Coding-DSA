package contest.leetcode.strings;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class Problem2 {
    public static void main(String[] args) {
       // Scanner scanner=new Scanner(System.in);
      //  String inputString=scanner.nextLine();
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    private static String reverseWords(String s) {
        s="Let's take LeetCode contest";
        String[] array=s.split(" ");


        StringBuilder stringBuilder2=new StringBuilder();
        for (int i=0;i<array.length;i++){
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(array[i]);
            stringBuilder2.append(stringBuilder.reverse().append(" "));
        }



       return stringBuilder2.toString().trim();
    }


}
