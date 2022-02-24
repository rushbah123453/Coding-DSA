package contest.leetcode.strings;

//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

//https://leetcode.com/problems/to-lower-case/
public class Problem5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.next();
        System.out.println(toLowerCase(inputString));

        //optimized solution using char array
        System.out.println(toLowerCase2(inputString));
    }

    private static String toLowerCase(String str) {


        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                char lower= (char) (str.charAt(i)+32);
                stringBuilder.append(lower);
            }else {
                stringBuilder.append(str.charAt(i));
            }

        }
        return stringBuilder.toString();
    }


    public static String toLowerCase2(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }
}
