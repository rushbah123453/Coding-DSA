package contest.leetcode.array;

import java.util.Scanner;

//https://leetcode.com/problems/sort-array-by-parity/
public class Problem23 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        sortArrayByParity(arr);
    }

    private static void sortArrayByParity(int[] A) {

int start=0;
int end=A.length-1;

while (start<end){

    while (start<A.length){
        if ((A[start]%2==0)){
            start++;
        }else {
            break;
        }
    }



    while (start<A.length && end>=0){
        if (!(A[end]%2==0)){
            end--;
        }else {
            break;
        }
    }

    if (start<end){
        int temp=A[end];
        A[end]=A[start];
        A[start]=temp;
        start++;end--;
    }



}



    }
}
