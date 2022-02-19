package algorithms.dp.knapsack.BoundedKnapsack;

public class CountnumberOfSubsetWithGivenDiff {
static int count;
    public static void main(String[] args) {
        count=0;
        int v[]={1,1,1,1,1,1};
        int n=v.length;
        int diff=3;
        System.out.println("Recurssive Approach");

        if((getSum(v)+diff)%2!=0) System.out.println("ans="+0);
   else
            System.out.println("ans="+recurssive(v,n,(getSum(v)+diff)/2));
       // System.out.println("res= "+res);
       // System.out.println("ans="+ans);
        System.out.println("");
        System.out.print("number of subset ");
        System.out.print(countNumberOfSubsetWithDiff(v,n,diff));
        System.out.println("");
    }

    private static int getSum(int[] v) {
        int sum=0;
        for (int x:v)
            sum+=x;
        return sum;
    }


    private static int recurssive(int[] v,int n,int sum)
    {

        if (sum==0) {
            // System.out.println("sum = "+sum);
            return 1;
            // return;
        }
        if(n<=0)return 0;
        if (v[n-1]>sum)
            return recurssive(v,n-1,sum);
        else{
            System.out.println("n-1= "+(n-1)+" sum= "+sum);
            return     recurssive(v,n-1,sum)+recurssive(v,n-1,sum-v[n-1]);
        }
    }

    private static int countNumberOfSubsetWithDiff(int[] v, int n, int diff) {
       int sum=0;
       for (int x:v){
           sum+=x;
       }

       if((diff+sum)%2!=0) //if diff+sum is odd , no subset possible
           return 0;

        //   s1 +  s2 =sum
        //   s1 -  s2=diff
        //   2*s1=sum+diff
        //   s1=(sum+diff)/2  where sum+diff should be mandatory even

        int s1=(diff+sum)/2;

       return countNumberOfSubset(v,n,s1);
    }


    private static int countNumberOfSubset(int[] v, int n, int sum) {
        int dp[][]=new int[n+1][sum+1];

        for (int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }


        for (int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if (j>=v[i-1]){
                    dp[i][j]=dp[i-1][j] + dp[i-1][j-v[i-1]];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[n][sum];

    }
}
