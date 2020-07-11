package algorithms.stringMatchingAlgo.KMP;

public class kmp {
    public static void main(String[] args) {
        kmp("abcabaaeecabce","aaeec");
    }

    public static void kmp(String inputString,String pattern){
        int n=inputString.length();
        int m=pattern.length();
        int i=0,j=0;
        int [] lsp=new int[m];
        computeLPS(lsp,pattern);
        System.out.println("");
        for (int x:lsp){
            System.out.print(x+" ");
        }

        while (i<n){
            if (inputString.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }

            if (j==m){
                System.out.print("Pattern found at"+(i-j));
              break;
            }


            else if (i<n && inputString.charAt(i)!=pattern.charAt(j)){
                if(j!=0){
                    j=lsp[j-1];
                }else{
                    i++;
                }
            }


        }

    }

    private static void computeLPS(int[] lsp, String pattern) {

        int len=0;
        int i=1;
        int m=pattern.length();
        lsp[0]=0;

        while (i<m){
            if (pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lsp[i] = len;
                i++;
            }else {
                if (len!=0){
                    len=lsp[len-1];
                }else {
                    lsp[i]=0;
                    i++;
                }
            }
        }


    }
}
