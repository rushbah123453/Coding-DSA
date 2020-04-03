package dsa.searching;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int noOfBuilding=scanner.nextInt();
            int buildingSize[]=new int[noOfBuilding];
            for (int k = 0; k < noOfBuilding; k++) {
                buildingSize[k] = scanner.nextInt();
            }

            sunFacingBuilding(buildingSize);
        }
    }

    private static void sunFacingBuilding(int[] buildingSize) {
        int maxTillNow=-1;
        int count=0;
        for (int i=0;i<buildingSize.length;i++){
            if (maxTillNow<buildingSize[i]){
                count++;
                maxTillNow=buildingSize[i];
            }
        }

        System.out.println(count);
    }

}
