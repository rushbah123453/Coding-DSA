package recentInterviewQuestions;

//Given array is sorted
public class SmallestMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Missing number: " + missingNumber(nums, 0, nums.length - 1));

    }
    public static int missingNumber(int[] nums, int start, int end) {
        while(start <= end) {
            if(nums[start] != start) return start;
            int middle = start + (end - start) / 2;
            if(nums[middle] == middle) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return end + 1;
    }
}
