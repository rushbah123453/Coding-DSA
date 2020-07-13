package contest.challenge.Problem1;

import java.sql.Array;
import java.util.Arrays;

/*Best Merged Portfolio
Task
As a share trader, you're given the tasks of evaluating various portfolios that are being held by the bank and determining the value of each portfolio in order to make future decisions. In this first scenario, you have access to a series of portfolios that each contain a subset of 16 stocks.

Each of these portfolios can be represented by a 16-bit unsigned integer, where the kth bit with value 1 represents the stock k being present in the portfolio, and likewise a value of 0 for bit k means that stock k is not present in the portfolio.

A portfolio can be evaluated as its decimal value. For example, the portfolio that only contains stock 0 and stock 2 would be written as [0,...,1,0,1] and therefore has a evaluated value of 5.

You've been given the task of finding the best merged portfolio by combining any two of the portfolios.

Two portfolio A and portfolio B can be merged to create portfolio C with the follow 3 rules:

For each stock:
If it exists in neither portfolio A or portfolio B, then it doesn't exist in portfolio C
If a stock exists in just one of portfolio A or portfolio B then it does exist in portfolio C
If a stock exists in both portfolio A and B, due to conflicts of interest, this cannot exist in portfolio C.
Therefore consider the following example.

The portfolio A with decimal evaluation value 10 = [0,...,1,0,1,0] and portfolio B with decimal evaluation value [0,...,0,1,1,0] have the combined portfolio [0,...,1,1,0,0] which has a decimal evaluation value of 12.

Your task is to find, given a set of portfolios, represented by their decimal values, to find the maximum evaluated value of a combined portfolio that can be made by combining any two of the provided portfolios.

Constraints
Your input will be an array = [p1, p2, p3, ... , pN] where N <= 100 For each porfolio pi in this array, these will have a maximum decimal value of 231-1 since we're using unsigned integers.

Examples
In the following example, we'll be considering 4 portfolios, each containing a subsets of 4 stocks.

Example 1
input: [15, 8, 6, 7] output: 15

If we consider the first pair, we have 15 = [1,1,1,1] and 8 = [1,0,0,0] which has a combined portfolio value of [0,1,1,1] = 7.

The pair that gives us the maximum evaluation value is the combined portfolio from 8 and 7. We have 8 = [1,0,0,0] and 7 = [0,1,1,1] with the combined portfolio value of [1,1,1,1] = 15.

Example 2
input: [9, 7, 12, 2] output: 14

If we consider the portfolios 9 = [1,0,0,1] and 7 = [0,1,1,1] we get the combined portfolio of [1,1,1,0] which has an evaluation value of 14.*/
public class Problem1 {

    public static void main(String[] args) {

       int arr[]={9, 7, 12, 2};
       int res= bestmergedportfolio(arr);
        System.out.println(res);
    }

    private static int bestmergedportfolio(int[] arr) {
        Arrays.sort(arr);
int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
max=Math.max(max,arr[i]^arr[j]);
            }
        }

        return max;
    }

}
