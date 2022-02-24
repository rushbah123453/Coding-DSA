package algorithms.fundamentalAlgosImplementation.Searching;

public class BinarySearch {
    public static int getIndex(int[] arr, int num, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == num) return mid;
            else if(arr[mid] > num) return getIndex(arr, num, start, mid - 1);
            return getIndex(arr, num, mid + 1, end);
        }
        return - 1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 10, 15, 18 };
        System.out.println("Index of element: " + getIndex(arr, 10, 0, arr.length - 1));

    }
}
