package algorithms.test;

public class Demo {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 3, 2};
        System.out.println(searchPivotElement(arr));
    }

    private static int searchPivotElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
            start = mid + 1;
            mid = (start + end) / 2;
        }

        return arr[mid];

    }
}
