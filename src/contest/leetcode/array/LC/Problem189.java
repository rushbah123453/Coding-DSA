package contest.leetcode.array.LC;
//https://leetcode.com/problems/rotate-array/
public class Problem189 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
      //  rotate(nums,k);
        secondApproach(nums,k);
    }

    private static void secondApproach(int[] nums, int k) {
        int n=nums.length;
        int a[]=new int[n];

        if (k%n==0){
            return;
        }
        for (int i=0;i<n;i++){
            a[(i+k)%n]=nums[i];
        }

        for (int i=0;i<n;i++){
            nums[i]=a[i];
        }

        for (int x: nums){
            System.out.print(x+" ");
        }

    }

    private static void rotate(int[] nums, int k) {
        k=k%nums.length;
        for (int i=0;i<k;i++){
            rotateHelper(nums);
        }

        for (int x: nums){
            System.out.print(x+" ");
        }
    }

    private static void rotateHelper(int[] nums) {
      int end=nums.length-1;
      int start=0;
      int temp=nums[end];
      for (int i=end-1;i>=start;i--){
          nums[i+1]=nums[i];
      }
      nums[start]=temp;
    }
}
