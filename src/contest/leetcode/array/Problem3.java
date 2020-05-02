//https://leetcode.com/problems/monotonic-array/
package contest.leetcode.array;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print(isMonotonic(arr));
    }

    private static boolean isMonotonic(int[] A) {

        boolean isAscending=false;
        boolean isDescending=false;
        int i=0;
        for(;i<A.length;i++){
            if(i<A.length-1 && A[i]<A[i+1]){
                isAscending=true;
                break;
            }
            else if(i<A.length-1 && A[i]>A[i+1]){
                isDescending=true;
                break;
            }

        }

        if(!isAscending && !isDescending){
            return true;
        }

        if(isAscending){
            for(;i<A.length;i++){
                if(i<A.length-1 && !(A[i]<=A[i+1]))
                    return false;
            }
        }else if(isDescending){
            for(;i<A.length;i++){
                if(i<A.length-1 && !(A[i]>=A[i+1])){
                    return false;
                }
            }
        }else{
            return false;
        }


        return true;
    }
}
