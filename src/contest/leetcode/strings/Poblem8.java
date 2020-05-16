package contest.leetcode.strings;
//https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class Poblem8 {

    public static void main(String[] args) {
        String s="LLRRLR";
        System.out.println(balancedStringSplit(s));
    }

    private static int balancedStringSplit(String s) {
        int count=0;int res=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='L'){
                count++;
            }else {
                count--;
            }

            if (count==0){
                res++;
            }
        }
        return res;
    }
}
