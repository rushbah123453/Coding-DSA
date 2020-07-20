package contest.challenge.Problem1;

public class Resultx {



    static int forthBit(int nuber){
        if((nuber & (1 << (4-1))) != 0){
            return 1;
        }else {
            return 0;
        }
    }


















    public static void main(String[] args)
    {
        int num = 23, K = 4;

        System.out.println(forthBit(num));
    }
}
