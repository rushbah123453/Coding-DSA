//https://mycode.prepbytes.com/coding/recursion/STRPLRC

package recursion;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String str = scanner.next();
         boolean result=   palindrome(str);
         if (result) System.out.println("Yes");
         else System.out.println("No");
        }

    }

    private static boolean palindrome(String str) {

        int length=str.length();

        if (length==0)
            return true;

      return   checkPalindrome(str,0,length-1);

    }

    private static boolean checkPalindrome(String str, int start, int end) {

        if (start==end)
            return true;


            if (str.charAt(start)!=str.charAt(end))
                return false ;


            if(start<end)
                checkPalindrome(str,start+1,end-1);

            return true;


    }
}
