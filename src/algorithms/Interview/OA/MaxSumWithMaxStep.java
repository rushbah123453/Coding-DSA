package algorithms.Interview.OA;

public class MaxSumWithMaxStep {
static int max;
    public static void main(String[] args) {
        max=0;
        int arr[]={10,2,-10,5,20};
        int maxSteps=2;
        getMaxSum(arr,maxSteps,arr.length);
        System.out.println("Max Sum = "+max);
    }

    private static void getMaxSum(int[] arr, int maxSteps, int length) {

        for (int i=0;i<length;i++)
        {
            getMaxSumAtIndex(i,arr,0,maxSteps);
        }
    }

    private static void getMaxSumAtIndex(int idx, int[] arr, int sum, int maxSteps) {


        sum=sum+arr[idx];
        max=Math.max(max,sum);
        for (int i=idx+1;i<arr.length;i++)
        {
            if(maxSteps>0)
                getMaxSumAtIndex(i,arr,sum,maxSteps-1);
            else
                break;
        }

    }
}
