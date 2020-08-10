package companyCodingQuestion.CompanyPrep.Amazon;

public class CanPermutePalindrome {
    public static void main(String[] args) {
        String s="codedoe";
        System.out.println(canPermutePalindrome(s));
    }

    private static boolean canPermutePalindrome(String s) {
        int chars[]=new int[128];
        for (int i=0;i<s.length();i++){
            chars[s.charAt(i)]++;
        }
int count=0;
        for (int i=0;i<128;i++){
            if(chars[i]%2!=0){
                count++;
            }
        }

        return count<=1;

    }
}
