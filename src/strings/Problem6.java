//https://mycode.prepbytes.com/coding/strings/CARDGAME

package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem6 {


    public static void main(String[] args) throws IOException {

        Scanner in =new Scanner(System.in);

        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {

           // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String studentName = in.next();
           // String studentName = br.readLine();
            Map<Character,Integer> count=new HashMap<>();
            for (int i=0;i<studentName.length();i++){

                if (count.get(studentName.charAt(i))==null){
                    count.put(studentName.charAt(i),1);
                }else{
                    count.put(studentName.charAt(i),count.get(studentName.charAt(i))+1);
                }

            }

            // TreeMap to store values of HashMap
            TreeMap<Character, Integer> sorted = new TreeMap<Character, Integer>(count);
            Iterator it = sorted.entrySet().iterator();
            boolean flag=false;
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if ((Integer) pair.getValue()>1){
                    System.out.print(pair.getKey() + "=" + pair.getValue());
                    flag=true;
                }


                it.remove(); // avoids a ConcurrentModificationException
            }

            if (!flag){
                System.out.println(-1);
            }else {
                System.out.println("");
            }

        }

    }

}
