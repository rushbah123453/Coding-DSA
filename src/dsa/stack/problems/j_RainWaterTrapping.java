package dsa.stack.problems;

public class j_RainWaterTrapping {
    public static void main(String[] args) {
        int a[]={3,0,0,2,0,4};
        int water=findTrappedWater(a);
        System.out.println("Trapped Water: "+water);
    }

    private static int findTrappedWater(int[] a) {
        int maxLeft[]=new int[a.length];
        int maxRight[]=new int[a.length];

        maxLeft[0]=a[0];
        maxRight[a.length-1]=a[a.length-1];
        maxRight[a.length-1]=a[a.length-1];
        for (int i=1;i<a.length;i++){
            maxLeft[i]=Math.max(maxLeft[i-1],a[i]);
        }
        for (int i=a.length-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],a[i]);
        }

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+(Math.min(maxLeft[i],maxRight[i])-a[i]);
        }

        return sum;

    }
}
