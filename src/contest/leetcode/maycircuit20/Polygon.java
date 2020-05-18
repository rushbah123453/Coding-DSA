package contest.leetcode.maycircuit20;

import java.math.BigInteger;
import java.util.Scanner;

//https://www.hackerearth.com/challenges/competitive/may-circuits-20/algorithm/cycle-count-0644f309/
public class Polygon {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long testCases=s.nextLong();
        for (int i=0;i<testCases;i++){
            System.out.println(getCycle(s.nextBigInteger()));
        }
    }

    private static BigInteger getCycle(BigInteger nextInt) {



        BigInteger one=new BigInteger("1");
        BigInteger number=nextInt.pow(2);
       BigInteger res= (number.subtract((nextInt.subtract(one))));
        return res;
    }
}
