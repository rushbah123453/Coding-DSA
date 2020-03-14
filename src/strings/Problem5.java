//https://mycode.prepbytes.com/coding/strings/CARDGAME


package strings;

import java.util.*;
import java.io.*;

public class Problem5 {
    public static void main(String args[]) throws IOException {

        Scanner in =new Scanner(System.in);

        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //String cardOnTable = br.readLine();
            String cardOnTable = in.next();
            char rank=cardOnTable.charAt(0);
            char suit=cardOnTable.charAt(1);
            boolean flag=false;

            String myCards = "";

            for (int k=0;k<5;k++){
                myCards+=in.next()+" ";
            }
           // System.out.println(myCards);

            for (int i=0;i<myCards.length();i+=3){

                if (myCards.charAt(i)==rank){
                    flag=true;
                    break;
                }


            }


            if (!flag){
                for (int k=1;k<myCards.length();k+=3){

                    if (myCards.charAt(k)==suit){
                        flag=true;
                        break;
                    }

                }
            }


            if (flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }




        }


    }
}