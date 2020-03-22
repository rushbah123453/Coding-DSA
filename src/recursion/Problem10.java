package recursion;

import java.util.Scanner;

public class Problem10 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int k = scanner.nextInt();

            int nos[]={1,2,3,4};
            int length=nos.length;
            printNum(0,length-1,nos,k);
        }

    }

    static void printNum(int start,int l,int []arr, int k
                            )
    {

        if (l==0){
            System.out.println((arr[start]*Math.pow(10,k-1))+arr[l+1]);
            return;
        }

        for (int i=1;i<4;i++){
            printNum(i-1,l-1,arr,k);
        }
    }
}
