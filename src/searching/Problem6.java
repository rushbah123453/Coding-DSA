//https://mycode.prepbytes.com/problems/searching/SMALLNUM

package searching;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        int unsortedArray[] = new int[testCases];
        for (int i=0;i<testCases;i++) {

          unsortedArray [i]=scanner.nextInt();

        }

        int k=scanner.nextInt();

       // Arrays.sort(unsortedArray);
        printSmallNum(unsortedArray,k);

    }

    private static void printSmallNum(int[] a, int k) {


        Map<Integer,Integer> map=new TreeMap<>();


        for (int i=0;i<a.length;i++){


            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }



        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==k){
                System.out.println(entry.getKey());
                break;
            }

        }
    }

}
