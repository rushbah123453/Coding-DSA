package algorithms.dp.Interview;

public class _2EqualPartitionSum {

    public static void main(String[] args) {
        int arr[]={1,6,2,11,5};
        boolean partition=isEqualPartition(arr);
        System.out.println(partition);
    }

    private static boolean isEqualPartition(int[] arr) {
        int n=arr.length;
        int sum=0;
        for (int x:arr){
            sum+=x;
        }

        if(sum%2!=0)return false;

        boolean dp[][]=new boolean[n+1][sum+1];

        for (int i=0;i<n+1;i++){
            for (int j=0;j<sum+1;j++){
                if(j==0)dp[i][j]=false;
                if(i==0)dp[i][j]=true;
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

        return dp[n][sum];

    }
}
