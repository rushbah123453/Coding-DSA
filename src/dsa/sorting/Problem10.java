//https://mycode.prepbytes.com/problems/sorting/POWERLEX
package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem10 {

    public static void main(String[] args) {
       // char []set = {'a', 'b', 'c'};
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char a[]=str.toCharArray();
        Arrays.sort(a);

        printPowerSet(a, a.length);
    }

    static void printPowerSet(char []set,
                              int set_size)

    {

        TreeSet<String> lex=new TreeSet<>();
        long pow_set_size =
                (long)Math.pow(2, set_size);
        int counter, j;


        for(counter = 0; counter <
                pow_set_size; counter++)
        {

            String s="";
            for(j = 0; j < set_size; j++)
            {

                if((counter & (1 << j)) > 0){
                    s+=set[j];

                }

            }

            lex.add(s);
           // System.out.println();


        }


    for (String ch:lex){
        System.out.println(ch);
    }
    }
}
