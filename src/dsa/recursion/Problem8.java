
//https://mycode.prepbytes.com/coding/recursion/CRACK
package dsa.recursion;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = scanner.nextInt();
            printPassword(0,a);
        }

    }

    private static void printPassword(int number,int length) {

        if(length==0){
            System.out.println(number);
            return;
        }

        for(int i=1; i<10; i++){
            printPassword(number*10 + i, length-1); ;
        }


    }
}

