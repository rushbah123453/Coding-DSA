package algorithms.dp.knapsack.BoundedKnapsack;

public class EqualSumPartition {
    public static void main(String[] args) {
        int v[]={2,5,7,3,11};
        int n=v.length;
        int sum=getSum(v);


        //  Recurssive approach
        System.out.println("Recurssive Approach");
       boolean res= isEqualSumPartition(v,n,sum/2);
        System.out.println(res);

        //DP
        System.out.println("DP Approach");
        System.out.print("Equal sum partition possible?  ");
        System.out.print(isEqualSumPartition(v,n,sum));
        System.out.println("");
    }



    private static boolean isEqualPartitionRecurssive(int[] v,int n,int sum)
    {
        if(n<=0)return false;
        if(sum==0)return true;
        if(v[n-1]>sum)
           return isEqualPartitionRecurssive(v,n-1,sum);
        else
          return isEqualPartitionRecurssive(v,n-1,sum) || isEqualPartitionRecurssive(v,n-1,sum-v[n-1]);
    }

    private static int getSum(int[] v){
        int arraySum=0;
        for(int i=0;i<v.length;i++){
            arraySum+=v[i];
        }
        return arraySum;
    }


    private static boolean isEqualSumPartition(int[] v, int n, int sum) {

        int arraySum=0;
        for(int i=0;i<n;i++){
            arraySum+=v[i];
        }

        if (arraySum%2!=0)
            return false;
        else
            return subsetSum(v,n,arraySum/2);

    }

    private static boolean subsetSum(int[] v, int n, int sum) {

        boolean dp[][]=new boolean[n+1][sum+1];

        for (int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        }


        for (int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if (j>=v[i-1]){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-v[i-1]];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }


        return dp[n][sum];

    }
}
