package contest.leetcode.array.LC;
//https://leetcode.com/problems/arranging-coins/
public class Problem441 {

    public int arrangeCoins(int n) {

        int x=1;
        int count=0;

        while(n>=x){
            n=n-x++;
            count++;
        }

        return count;

    }
}
