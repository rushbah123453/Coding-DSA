package algorithms.dp.knapsack.UnBoundedKnapsack;

public class RodCuttingRecursive {

    public static void main(String[] args) {
        int rod[]={1,2,3,4,5,6,7,8};
        int value[]={1,5,8,9,10,17,8,20};
        int length=8;
        int n=rod.length;
        int maxPrice=findMaxPriceRodCutting(rod,value,length,n);
        System.out.println(maxPrice);
    }

    private static int findMaxPriceRodCutting(int[] rod, int[] value, int length,int n) {
        if(n==0)return 0;
        if(length==0)return 0;
        if(rod[n-1]>length)
            return findMaxPriceRodCutting(rod,value,length,n-1);
        else
            return Math.max(findMaxPriceRodCutting(rod,value,length,n-1),
                    value[n-1]+findMaxPriceRodCutting(rod,value,length-rod[n-1],n));
    }
}
