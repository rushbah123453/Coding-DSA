package contest.leetcode.array.LC;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Problem121 {
    public static void main(String[] args) {
        int prices[]={3,4,5,2,5,100};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int prices[]) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            else if (prices[i]-min>max){
                max=prices[i]-min;
            }


        }
        return max;
    }
}
