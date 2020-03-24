package searching;

import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int innerCase[]=new int[2];
            for (int k=0;k<2;k++){
                 innerCase[k] = scanner.nextInt();
            }

            int a[] = new int[innerCase[0]];
            for (int j = 0; j < innerCase[0]; j++) {
                a[j] = scanner.nextInt();

            }

        System.out.println(    floorOfNumber(a,innerCase[1]));

        }

    }

    private static int floorOfNumber(int[] a, int nos) {

if(nos<a[0])
  return -1;

if (nos>a[a.length-1])
    return a[a.length-1];

int low=0;
int high=a.length-1;



while (low<=high){
    int mid=low+((high-low)/2);
    if (a[mid]==nos){
        return nos;
    }
    else if(a[mid-1]<=nos && nos<a[mid] && mid>0)
    {
        return mid-1;
    }else if(nos<a[mid]){
        high=mid-1;
    }
    else if (a[mid-1]<=nos && nos<a[mid] && mid>0){
        return a[mid-1];
    }

}


    return -1;

    }


}
