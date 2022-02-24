// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // max multiplication value will be 10^2 * 10^3 which will not overflow for integer type
        if (A.length == 0) return 0;
        int multValue = 1;
        for (int num : A) {

            // if one of the values is zero no need to check other values
            if (num == 0) return 0;
            multValue *= num;
        }
        if (multValue > 0) return 1;
        else if (multValue < 0) return -1;
        else return 0;
    }
}

public class CodilityTest {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {1, -2, -3, 5, -1};
//        System.out.println("Res: " + s.solution(nums));
    }
}
