package contest.leetcode.strings.LC;

public class Problem344 {

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        if (s.length<=1)
            return;
        int start=0;
        int end=s.length-1;
        while (start<end){
            if (s[start]!=s[end]){
                char temp=s[end];
                s[end]=s[start];
                s[start]=temp;
            }
            start++;
            end--;
        }
        for (char x:s){
            System.out.print(x+" ");
        }
    }
}
