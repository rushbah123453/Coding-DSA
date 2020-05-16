package contest.leetcode.array;

//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
public class Problem29 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4};
        int queries[][] = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int a[] = sumEvenAfterQueries(A, queries);
    }

    private static int[] sumEvenAfterQueries(int[] a, int[][] queries) {

        int length = queries.length;
        int res[] = new int[length];

        int sumOfEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumOfEven += a[i];
            }
        }


        for (int i = 0; i < length; i++) {
            int num = 0;
            if (a[queries[i][1]] % 2 == 0) {
                // res[i]=sumOfEven+a[queries[i][1]];
                num = a[queries[i][1]];
                sumOfEven = sumOfEven - num;
                a[queries[i][1]] = a[queries[i][1]] + queries[i][0];

            } else {
                a[queries[i][1]] = a[queries[i][1]] + queries[i][0];
            }
            if (a[queries[i][1]] % 2 == 0) {
                sumOfEven += a[queries[i][1]];
                res[i] = sumOfEven;
            } else {

                res[i] = sumOfEven;
            }


        }

        return res;
    }

    private static int findSumOfEven(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
