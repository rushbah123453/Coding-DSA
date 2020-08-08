package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.HashMap;
import java.util.Map;

public class FindSubArrayWithGivenSum {

    public static void main(String[] args) {
        int a[]={1,4,20,3,10,5};
        int sum=38;
        findSubArrayWithSum(a,sum);
    }

    private static void findSubArrayWithSum(int[] a, int sum) {
        Map<Integer,Integer> map=new HashMap<>();
        int currSum=0;
        for (int i=0;i<a.length;i++){
            currSum+=a[i];
            if (currSum==sum){
                System.out.println("From (0,"+i+")");
               return;
            }
            if (map.containsKey(currSum-sum)){
                System.out.println("From ("+ (map.get(currSum-sum)+1)+","+i+")");
              return;
            }else {
                map.put(currSum,i);
            }
        }
        System.out.println("not found");
    }
}
