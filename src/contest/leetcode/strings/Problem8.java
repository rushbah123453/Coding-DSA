package contest.leetcode.strings;

public class Problem8 {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {

        s=" ";
        s=s.trim();
        String str[]=null;
        if (s.length()>0){
            str=s.split(" ");
            return str[str.length-1].length();
        }else {
            return 0;
        }


    }
}
