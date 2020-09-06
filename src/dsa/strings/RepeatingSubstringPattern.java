package dsa.strings;

public class RepeatingSubstringPattern {

    public static void main(String[] args) {

        System.out.println( repeatedSubstringPattern("abab"));
    }


    public static boolean repeatedSubstringPattern(String s) {

        int n=s.length();
        for(int i=0;i<n/2;i++){
            String sb;
            sb=s.substring(0,i+1);
            StringBuffer ans=new StringBuffer(sb);
            while(ans.length()<s.length()){
                ans.append(sb);
            }
            if(ans.toString().equals(s))
            {
                return true;

            }

        }

        return false;
    }
}
