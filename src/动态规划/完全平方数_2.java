package 动态规划;
import java.util.ArrayList;

public class 完全平方数_2 {
    public static void main(String[] args) {

        System.out.println(numSquares(12));
    }
    static ArrayList<Integer> array = new ArrayList<>();

    public static int numSquares(int n) {
        is(n);
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            for (int num : array) {
                if (num > i) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - num] + 1);
            }
        }
        return dp[n];
    }

    private static void is(int n) {
        for (int i = 1; i < n; i++) {
            int mid = (int) Math.pow(i, 0.5);
            if (mid * mid == i) {
                array.add(i);
            }
        }
    }
}