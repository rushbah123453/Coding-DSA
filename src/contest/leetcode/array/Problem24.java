package contest.leetcode.array;

import java.util.Scanner;

//https://leetcode.com/problems/valid-mountain-array/
public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        int arr[] = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(validMountainArray(arr));


        //optimized solution
        System.out.println( secondvalidMountainArray(arr));


        //secondoptimized slution
        System.out.println(thirdvalidMountainArray(arr));
    }

    private static boolean validMountainArray(int[] arr) {
        boolean increasing = false;
        boolean flag=false;
        if (arr.length <= 1)
            return false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            } else if (arr[i] > arr[i + 1]) {
                return (increasing && checkDecreasing(arr, i + 1));
            }
            increasing = true;
        }
        return false;
    }

    private static boolean checkDecreasing(int[] arr, int l) {
        for (int i = l; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1])
                return false;
        }
        return true;
    }



    public static boolean secondvalidMountainArray(int[] A) {
        if (A.length < 3) return false;
        int start = 0;
        int end = A.length-1;
        while (start < end) {
            if (A[start+1] > A[start]) {
                start++;
            } else if (A[end-1] > A[end]) {
                end--;
            } else {
                break;
            }
        }
        return start != 0 && end != A.length-1 && start == end;
    }



    public static boolean thirdvalidMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
