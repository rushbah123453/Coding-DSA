//https://www.geeksforgeeks.org/count-ways-reach-nth-stair/
package companyCodingQuestion.recommended.arrays;

import java.util.Scanner;

public class CountWaysToReachNthStair {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nStair=scanner.nextInt();


        // it can take either 1 , 2 or 3 steps at a time
        //Example for 3 steps -> Output = 4 -> 1 1 1 , 1,2 , 2,1 , 3
        System.out.println(countMaxPossibleWays(nStair+1)); // exponential time


        //typical optimized fibonacci series
       System.out.println( countMaxPossibleWaysByFormula(nStair+1));  //O(1) , optimizied way // it gives f(n-1) , so put n+1 to get f(n)



       //for n steps for 1 to m ways
        //lets say m=2,
        //so n steps and 1 ,2 ways
        int m=2;
       System.out.print(countWays(nStair+1,m));

    }

    private static int countWays(int nStair, int m) {


        if (nStair<=1){
            return nStair;
        }

        int result=0;
        for (int i=1;i<=m && i<=nStair;i++){
             result+= countWays(nStair-i,m);
        }

      return result;

    }


    private static int countWaysmyWat(int nStair, int m) {
        //this will also wprk
        //basically i will make all
        //f(n)=0 if n<=0
        //simplest way to think
        //but not optimized

        if(nStair<=0){
            return 0;
        }

        if (nStair<=1){
            return nStair;
        }

        int result=0;
        for (int i=1;i<=m ;i++){
            result+= countWays(nStair-i,m);
        }

        return result;

    }


    private static int countMaxPossibleWaysByFormula(int nStair) {
        double phi =(1+Math.sqrt(5))/2;
        return  (int) Math.round(Math.pow(phi,nStair)/Math.sqrt(5));
    }

    private static int countMaxPossibleWays(int nStair) {

        if(nStair<=0){
            return 0;
        }
        if (nStair<=1){
            return nStair;
        }

        return countMaxPossibleWays(nStair-1)+countMaxPossibleWays(nStair-2)+countMaxPossibleWays(nStair-3);


    }
}
