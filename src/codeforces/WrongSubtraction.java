//https://codeforces.com/problemset/problem/977/A

package codeforces;

import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int input[]=new int[2];

        for (int i=0;i<input.length;i++) {
            input[i] = scanner.nextInt();
        }

        long variable=input[0];
       for (int j=0;j<input[1];j++){
           if(variable%10==0){
               variable/=10;
           }else {
               variable-=1;
           }
       }

System.out.println(variable);

    }
}
