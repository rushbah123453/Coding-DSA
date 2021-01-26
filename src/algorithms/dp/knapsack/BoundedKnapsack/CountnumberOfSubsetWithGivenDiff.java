package algorithms.dp.knapsack.BoundedKnapsack;

public class CountnumberOfSubsetWithGivenDiff {

    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4};
        int n = v.length;
        int diff = 1;

        System.out.println("");
        System.out.print("number of subset ");
        System.out.print(countNumberOfSubsetWithDiff(v, n, diff));
        System.out.println("");
    }

    private static int countNumberOfSubsetWithDiff(int[] v, int n, int diff) {
        // instead of checking for difference, code can just check if given sum s1 exists
        //   s1 +  s2 = sum
        //   s1 -  s2 = diff
        //   2*s1 = sum + diff
        //   s1 = (sum + diff) / 2
        // as a result (sum + diff) should be even
        int sum = 0;
        for (int x : v) {
            sum += x;
        }
        if ((diff + sum) % 2 != 0) //if diff+sum is odd , no subset possible
            return 0;

        int s1 = (diff + sum) / 2;

        return countNumberOfSubset(v, n, s1);
    }


    private static int countNumberOfSubset(int[] v, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0)
                    dp[i][j] = 0;
                if (j == 0)
                    dp[i][j] = 1;
            }
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j >= v[i - 1]) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - v[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];

    }
}
