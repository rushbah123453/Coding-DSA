package algorithms.Interview;

public class MaxProductRopeCutting {

    public static void main(String[] args) {
        int n = 5;
        int ans = maxproduct(n);
        System.out.println(ans);
    }

    private static int maxproduct(int n) {

        if (n == 0 || n == 1) return 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, Math.max((n - i) * i, maxproduct(n - i) * i));
        }
        return max;
    }
}
