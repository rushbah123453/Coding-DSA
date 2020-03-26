package searching;

import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int innerCase[]=new int[2];
            for (int k=0;k<2;k++){
                 innerCase[k] = scanner.nextInt();
            }

            int a[] = new int[innerCase[0]];
            for (int j = 0; j < innerCase[0]; j++) {
                a[j] = scanner.nextInt();

            }

        System.out.println(floorSearch(a,0,a.length-1,innerCase[1]));

        }

    }

    private static int floorSearch(int[] arr, int low,int high,int x) {

        if (low > high)
            return -1;


        if (x >= arr[high])
            return high;

        int mid = (low+high)/2;

        if (arr[mid] == x)
            return mid;

        if (mid > 0 && arr[mid-1] <= x && x <
                arr[mid])
            return mid-1;

        if (x < arr[mid])
            return floorSearch(arr, low,
                    mid - 1, x);

        return floorSearch(arr, mid + 1, high,
                x);

    }


}
