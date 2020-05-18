package contest.leetcode.strings.LC;
//https://leetcode.com/problems/first-unique-character-in-a-string/
public class Problem387 {
    public static void main(String[] args) {
        String s = "llieetcode";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        int frequencyArray[]=new int[256];
        for (char x:s.toCharArray()){
            frequencyArray[x-'a']++;
        }

        for (int i=0;i<s.length();i++){
            if (frequencyArray[s.charAt(i)-'a']<=1){
                return i;
            }
        }
        return -1;
    }
}
