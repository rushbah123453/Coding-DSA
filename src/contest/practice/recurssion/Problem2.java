package contest.practice.recurssion;

public class Problem2 {
    public static void main(String[] args) {
        String str="aaaa";
        System.out.println( isPalindrome(str,0,str.length()-1));
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start==end)
            return true;

        if (!(str.charAt(start)==str.charAt(end) ))
            return false;



        if (start<end)
            return isPalindrome(str,start+1,end-1);

        return true;
    }
}
