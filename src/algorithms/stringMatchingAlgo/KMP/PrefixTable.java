package algorithms.stringMatchingAlgo.KMP;

public class PrefixTable {
    public static void main(String[] args) {


     //  int pi[]= computePrefixTable("aabaabaaa");
        int pi[]= gfg("abcabaaeecabce");
        for (int x:pi){
            System.out.print(x);
        }
    }

    private static int[] computePrefixTable(String s){
        int m=s.length();
        int arr[]=new int[m];
        arr[0]=0;
        int k=0;
        for (int q=1;q<m;q++){
            while (k>0 && (s.charAt(k)!=s.charAt(q)))
                k=arr[k];
            if(s.charAt(k)==s.charAt(q))
                k=k+1;
            arr[q]=k;
        }
        return arr;
    }

    private static int[] gfg(String pat){

        int len = 0;
        int i = 1;
        int M=pat.length();
        int lps[]=new int[M];
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else // (pat[i] != pat[len])
            {
                if (len != 0) {
                    len = lps[len - 1];
                }
                else // if (len == 0)
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }


}
