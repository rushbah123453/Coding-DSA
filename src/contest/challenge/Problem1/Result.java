package contest.challenge.Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Result {

    String isValid( List<Integer> a) {
        int n=a.size();
        Stack<Integer> s = new Stack<Integer>();
        int root = Integer.MIN_VALUE;
        for (Integer x:a) {
            if (x < root) {
                return "NO";
            }
while (!s.empty() && s.peek() < x) {
                root = s.peek();
                s.pop();
            }
        s.push(x);
        }
        return "YES";
    }









    public static void main(String args[]) {
        Result bst = new Result();
        int[] pre1 = new int[]{1,3,2};
        int n = pre1.length;
        List<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(5);
        a.add(4);
        a.add(6);
        System.out.println(bst.isValid(a));

    }
} 