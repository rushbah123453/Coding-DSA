package contest.leetcode.strings.LC;
//https://leetcode.com/problems/valid-palindrome/
public class Problem125 {

    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        System.out.println(s);
        int length=s.length();
        int start=0;
        int end=length-1;

        while (start<end){

            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }

        }
        return true;
    }
}
