//https://mycode.prepbytes.com/problems/searching/TRANSPOINT

package dsa.searching;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int inputSize = scanner.nextInt();
            int inputArray[] = new int[inputSize];
            for (int k = 0; k < inputSize; k++) {
                inputArray[k] = scanner.nextInt();
            }

           System.out.println( printFirstOccurrence(inputArray));

        }



    }

    private static int printFirstOccurrence(int[] a) {



        int low=0;
        int high=a.length-1;

        while (low<=high){
            int mid=low+((high-low)/2);
            if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0)){
                return mid;
            }
            else if(a[mid]==1)
            {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
return -1;


    }

}
