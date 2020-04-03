//https://mycode.prepbytes.com/coding/strings/LNGUNIQUE

package dsa.strings;

import java.util.HashSet;
import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {

            String inputString = in.next();
            int initialWindow=0,slidingWindow=0,max=0;
            HashSet<Character> hashSet=new HashSet<>() ;
       while (slidingWindow<inputString.length()){

                if(!hashSet.contains(inputString.charAt(slidingWindow))){
                    hashSet.add(inputString.charAt(slidingWindow));
                    slidingWindow++;
                    max=Math.max(max,hashSet.size());

                }else{
                    hashSet.remove(inputString.charAt(initialWindow));
                    initialWindow++;
                }
            }

            System.out.println(max);


        }
    }
}
