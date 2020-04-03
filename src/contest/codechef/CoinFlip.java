//https://www.codechef.com/problems/CONFLIP#

package contest.codechef;

import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int j=0;j<testCases;j++) {
            int rounds = scanner.nextInt();
            for (int i = 0; i < rounds; i++) {

                int a[] = new int[3];
                for (int k=0;k<3;k++){
                    a[k]=scanner.nextInt();
                }

                if (a[1]%2==1){
                    if(a[0]==1){
                        System.out.println(a[1]/2);
                    }else{
                        System.out.println((a[1]+1)/2);
                    }
                }else{
                    if(a[0]==0){
                        System.out.println(a[1]/2);
                    }else{
                        System.out.println((a[1]+1)/2);
                    }


                }

            }
        }
    }
}
