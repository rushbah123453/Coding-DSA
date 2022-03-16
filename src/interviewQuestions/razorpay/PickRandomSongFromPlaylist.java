package interviewQuestions.razorpay;

import java.util.Arrays;
import java.util.Random;

public class PickRandomSongFromPlaylist {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int[] res=pickRandomSong(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] pickRandomSong(int[] arr) {
        int n=arr.length;
        Random random=new Random();
        for(int i=n-1;i>0;i--)
        {
            int j=random.nextInt(i+1);

            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
