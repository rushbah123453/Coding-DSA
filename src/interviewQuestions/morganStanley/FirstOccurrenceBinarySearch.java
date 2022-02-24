package interviewQuestions.morganStanley;

public class FirstOccurrenceBinarySearch {

    public static int findIndexOfFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, index = -1;
        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(arr[middle] == target) {
                // If element is found, assign middle value as index and
                // for first occurrence keep checking that element before the middle index (i.e. end = middle - 1)
                // for last occurrence keep checking that element after the middle index (i.e. start = middle + 1)
                index = middle;
                end = middle - 1;
            } else if(arr[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return index;
    }

    // Same comments as above. This algorithm had to be used in one of the coding questions for MS interview
    public static int findIndexOfFirstFalse(boolean[] arr) {
        int start = 0, end = arr.length - 1, index = -1;
        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(arr[middle] == false) {
                index = middle;
                end = middle - 1;
            } else if(arr[middle] == true) {
                start = middle + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // Sorted array
        int[] arr = { 1, 3, 4, 4, 6, 6, 6};
        int target = 6;
        System.out.println("First occurrence index: " + findIndexOfFirstOccurrence(arr, target));

        boolean[] booleanArr = {true, true, true, false, false};
        System.out.println("First false occurrence index: " + findIndexOfFirstFalse(booleanArr));
    }
}
