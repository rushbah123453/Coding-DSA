package contest.leetcode.array;
//
public class Problem26 {
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
    }

    private static void sortColors(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int position = 0;

        while (position <= end) {

            switch (arr[position]) {

                case 0:
                    swap(arr, start, position);
                    position++;
                    start++;
                    break;

                case 1:
                    position++;
                    break;


                case 2:
                    swap(arr, position, end);
                    end--;


            }


        }

        for (int x : arr) {
            System.out.print(x + " ");
        }


    }

    private static void swap(int[] arr, int start, int position) {

        int temp = arr[start];
        arr[start] = arr[position];
        arr[position] = temp;

    }
}
