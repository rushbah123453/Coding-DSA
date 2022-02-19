package algorithms.Interview;

public class MinimumAbsDiffPartition {
    public static void main(String[] args) {
        int arr[]={1,6,11,5};
        int min=getMinimumDiff(arr);
        System.out.println(min);
    }

    private static int getMinimumDiff(int[] arr) {
        int sum=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }

        boolean dp[][]=new boolean[n+1][sum+1];

        for (int i=0;i<n;i++){
            for (int j=0;j<sum+1;j++){
                if(i==0)dp[i][j]=false;
                if(j==0)dp[i][j]=true;
            }
        }


        for (int i=1;i<n+1;i++){
            for (int j=1;j<sum+1;j++){
               if(j>=arr[i-1]){
                   dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
               }else {
                   dp[i][j]=dp[i-1][j];
               }
            }
        }




        int min=Integer.MAX_VALUE;
        for (int i=1;i<(sum+1)/2;i++){
            if (dp[n][i]==true){
                int diff=sum-(2*i);
                min=Math.min(min,diff);
            }
        }

        return min;
    }
}
