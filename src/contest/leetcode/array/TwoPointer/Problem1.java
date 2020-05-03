//https://leetcode.com/problems/reverse-vowels-of-a-string/
package contest.leetcode.array.TwoPointer;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {
        int start = -1;
        int end = -1;

        if (s.length()<=0)
            return "";
        char c[]=s.toCharArray();

        for (int i=0;i<c.length;i++){
            if (isVowel(c[i])){
                start=i;
                break;
            }
        }


        for (int i=s.length()-1;i>start;i--){
            if (isVowel(c[i])){
                end=i;
                break;
            }
        }

        if (start==-1 || end==-1)
            return s;

        while (start<end){

            swap( c,start,end);

            while (!isVowel(c[++start]) && start<end){

            }

            while (!isVowel(c[--end]) && start<end){

            }
        }

return String.valueOf(c);

    }

    private static void swap(char[] c, int start, int end) {
        if (String.valueOf(c[start]).equals(String.valueOf(c[end]))){
            return;
        }
        char temp=c[start];
        c[start]=c[end];
        c[end]=temp;
    }

    private static boolean isVowel(char x) {
        return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U');
    }
}
