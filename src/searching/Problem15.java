
//https://mycode.prepbytes.com/problems/searching/MEDIAN1
package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Problem15 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[] = new int[2];
        for (int i=0;i<2;i++) {
            a [i]=scanner.nextInt();
        }

        int[] inputArray=new int[a[0]];
        for (int j=0;j<a[0];j++){
            inputArray[j]=scanner.nextInt();
        }

        findMaximumMedian(inputArray,a[1]) ;

    }

    private static void findMaximumMedian(int[] inputArray, int operation) {

        int low=0;
        int high=inputArray.length-1;
        int mid=low+((high-low)/2);
        Arrays.sort(inputArray);

        for (int i=1;i<=operation;i++){

            if((inputArray[mid]+1)<=inputArray[mid+1]){
                inputArray[mid]++;
            }
        }

        System.out.println(inputArray[mid]);



    }
}
