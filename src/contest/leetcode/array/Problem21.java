package contest.leetcode.array;

import java.util.Scanner;

//https://leetcode.com/problems/merge-sorted-array/
public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }

        int inputSize1=scanner.nextInt();
        int arr1[]=new int[inputSize1];
        for (int i=0;i<inputSize1;i++){
            arr1[i]=scanner.nextInt();
        }

        merge(arr,inputSize,arr1,inputSize1);

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n){

m=m-n;


int k=m-1;int l=n-1;

while(k>=0 && l>=0){

    if (nums1[k]<nums2[l]){
        nums1[k+l+1]=nums2[l];
        l--;
    }else {
        nums1[k+l+1]=nums1[k];
        k--;
    }
}

        if (l!=-1){
            for (int i=l;i>=0;i--){
                nums1[i]=nums2[i];
            }
        }


        for (int x:nums1){
            System.out.println(x+" ");
        }

    }

    private static void rigthSift(int[] nums1, int l) {
        for (int i=nums1.length-1;i>l;i--){
            nums1[i]=nums1[i-1];
        }
    }
}
