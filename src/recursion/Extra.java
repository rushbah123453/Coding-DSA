package recursion;

public class Extra {


    public static void main(String[] args) {

        solve(2,"RUSHABH");
    }


   public  static void solve(int l,String s)
    {
        if(l==0)
        {
          System.out.println( s);
            return;
        }

        for(int i=1;i<=9;i++)
        {
            solve(l-1,s+(char)('0'+i));
        }
    }
}
