package companyCodingQuestion.CompanyPrep.Amazon;

public class LongestContigousSubArray {
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        int max=findMaxSum(a);
        System.out.println(max);
    }

    private static int findMaxSum(int[] a) {

       int maxSoFar=Integer.MIN_VALUE ;
        for (int i=1;i<a.length;i++){
            a[i]=Math.max(a[i-1]+a[i],a[i]);
           maxSoFar=Math.max(maxSoFar,a[i]);
        }

        for (int x:a){
            System.out.print(x+" ");
        }
        System.out.println("");
        return maxSoFar;
    }
}
