package contest.leetcode.strings;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
import java.util.*;

public class Problem6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.next();
        System.out.println(lengthOfLongestSubstring(inputString));

    }

    private static int lengthOfLongestSubstring(String inputString) {

        inputString=" ";
        int length=inputString.length();
        int max=0;
        for (int i=0;i<length;i++){
            Set<Character> set=new HashSet<>();
           int count=0;
            for (int j=i;j<length;j++){
                if (!set.contains(inputString.charAt(j))){
                    set.add(inputString.charAt(j));
                    count++;
                }
                else {
                    break;
                }
                max=Math.max(max,count);
            }

        }

        return max;
    }

 /*   private static int secondApproach(String str){

        Map<Character,Objects> map=new LinkedHashMap<>();

        int min=1;int counter=1;
        for (int i=0;i<str.length();i++){

            if (!map.containsKey(str.charAt(i))){

                int previousValue=map.get(str.charAt(i-1)).counter;
                min=Math.min(i+1,previousValue+1);

            }else {
                int positionOfRepeating=map.get(str.charAt(i)).index;
                min=Math.min(i+1,(i+1)-positionOfRepeating);
                Objects objects=new Objects();
                objects.counter=i+1;
                objects.index=min;
                map.put(str.charAt(i),objects);
            }


        }


    }

    static class Objects{
        int index;
        int counter;
    }

*/


}
