//https://mycode.prepbytes.com/coding/recursion/BINARY1

package recursion;

import java.util.Scanner;

public class Problem7 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = scanner.nextInt();
            binary(a);
        }

    }

    private static void binary(int length) {

        if (length <= 0)
            return;

        StringBuilder str = new StringBuilder();
        str.setLength(length);

        //starting with 0
        str.setCharAt(0, '0');
        printMyBinary(str, length, 1);

        //Starting with 1
        str.setCharAt(0, '1');
        printMyBinary(str, length, 1);

    }

    private static void printMyBinary(StringBuilder str, int length, int i) {

        if (length == i) {
            System.out.println(str);
            return;
        }



        if (str.charAt(i - 1) == '0') {
            str.setCharAt(i, '0'); //add 0
            printMyBinary(str, length, i + 1);
            str.setCharAt(i, '1'); //add 1
            printMyBinary(str, length, i + 1);
        }


        if (str.charAt(i - 1) == '1') {
            str.setCharAt(i, '0'); //add 0
            printMyBinary(str, length, i + 1);
        }


    }
}
