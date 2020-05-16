package contest.leetcode.strings;

//https://leetcode.com/problems/repeated-substring-pattern/
public class Problem7 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcdabcd"));
    }

    private static boolean repeatedSubstringPattern(String string) {

        int length=string.length();

        for (int i=1;i<=length/2;i++){

            StringBuilder check=new StringBuilder();

            for (int j=1;j<=(length/(i));j++)
            {
                check.append(string.substring(0,i));
            }
            System.out.println(check);
            if (check.toString().equals(string)){
                return true;
            }

        }


        return false;
    }
}
