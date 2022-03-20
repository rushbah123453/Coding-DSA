import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = pow(2, 6, map);
        System.out.println("res value:" + res);
    }

    public static int pow(int num, int exp, Map<Integer, Integer> map) {
        if(map.containsKey(exp)) return map.get(exp);
        if(exp == 1) return num;
        int res = exp % 2 == 0 ? pow(num, exp / 2, map) * pow(num, exp / 2, map) :
                pow(num, exp / 2, map) * pow(num, (exp - 1) / 2, map);
        map.put(exp, res);
        return res;
    }

}
