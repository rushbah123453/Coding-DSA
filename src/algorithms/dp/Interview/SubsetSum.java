package algorithms.dp.Interview;

//Given a set of non-negative integers, and a value sum,
// determine if there is a subset of the given set with sum equal to given sum.
public class SubsetSum {

    public static void main(String[] args) {
        int subset[]={3,34,4,12,5,2};
        int sum=5;
        int n=subset.length;
        boolean ans=subsetSum(subset,sum,-1);
        System.out.println(ans);
    }

    private static boolean subsetSum(int[] subset, int sum, int n) {
        if(n==subset.length-1)return false;
        if(sum==0)return true;
        if(subset[n+1]>sum)
            return subsetSum(subset,sum,n+1);
        else return subsetSum(subset,sum,n+1)||subsetSum(subset,sum-subset[n+1],n+1);
    }
}
