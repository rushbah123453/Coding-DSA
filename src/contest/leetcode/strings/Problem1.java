package contest.leetcode.strings;

import java.util.Scanner;

//https://leetcode.com/problems/defanging-an-ip-address/
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.next();
        System.out.println(defangIPaddr(inputString));
    }

    private static String defangIPaddr(String address)
    {
        return address.replace(".", "[.]");
    }
}
