package searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem9 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }
voteMax(a);

        }

    }



    private static void voteMax(int[] a) {

        int k=a.length/2;
        boolean flag=false;

        Map<Integer,Integer> map=new HashMap<>();


        for (int i=0;i<a.length;i++){


            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }

        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>k){
                System.out.println(entry.getKey());
                flag=true;
                break;
            }

        }

        if(!flag)
            System.out.println(-1);


    }
}
