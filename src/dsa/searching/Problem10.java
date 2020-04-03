//https://mycode.prepbytes.com/problems/searching/KEYROTATE

package dsa.searching;

import java.util.Scanner;

public class Problem10 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }
            int x=scanner.nextInt();

            rotateHelperUtility(a,x);
        }
    }

    private static void rotateHelperUtility(int[] a, int x) {
        int pivotal=-1;
        for (int i=0;i<a.length-1;i++){
            if (a[i]>a[i+1]){
                pivotal=i+1;
            }
        }
        if (pivotal==-1){
            binarySearch(a,0,a.length-1,x);
        }else if(x>=a[0]){
            binarySearch(a,0,pivotal-1,x);
        }else {
            binarySearch(a,pivotal,a.length-1,x);
        }


    }

    private static void binarySearch(int[] a, int low, int high,int x) {

        int mid=low+((high-low)/2);
        boolean found=false;

        while (low<=high){
            mid=low+((high-low)/2);

            if (a[mid]==x){
                System.out.println(mid);
                found=true;
                break;
            }

            if (x<a[mid]){
                high=mid-1;
            }

            if (x>a[mid]){
                low=mid+1;
            }


        }

if (!found)
    System.out.println(-1);

    }


}
