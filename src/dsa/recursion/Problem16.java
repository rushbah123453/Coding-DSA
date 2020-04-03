//https://mycode.prepbytes.com/problems/recursion/POWERLEX
package dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Problem16 {


    public static void main(String[] args) {


       // String str = "abc";
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char a[]=str.toCharArray();
        Arrays.sort(a);
        String sortedString=String.valueOf(a);
        int index = -1;
        String curr = "";
        powerSet(sortedString, index, curr);
    }


    static void powerSet(String str, int index,
                         String curr)
    {
        int n = str.length();

        // base case
        if (index == n)
        {
            return;
        }

        System.out.println(curr);

        for (int i = index + 1; i < n; i++)
        {
            curr += str.charAt(i);
            powerSet(str, i, curr);

            curr = curr.substring(0, curr.length() - 1);
        }
    }


}
