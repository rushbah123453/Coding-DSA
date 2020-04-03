//maximize the profilt
//{1,2,100)=> Buy at 1 and 2 , sell at 100 so -1-2 == -3 for 2 shares , now sell it @100/share => 200-3=197

package companyCodingQuestion.CompanyPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoyLogic {


    public static void main(String[] args) {

        List<Integer> price=new ArrayList<>(Arrays.asList(1,2,100));
       System.out.println( maximumProfit(price));


    }

    private static long maximumProfit(List<Integer> price) {

        long profit=0;
        Integer maxTillNow=price.get(price.size()-1);
        for (int i=price.size()-2;i>=0;--i){
            profit+=Math.max(0,maxTillNow-price.get(i));
            maxTillNow=Math.max(price.get(i),maxTillNow);
        }
        return profit;
    }


}
