package 动态规划;

import java.util.Scanner;

public class 砝码称重_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 砝码个数
        int[] weights = new int[n]; // 砝码重量数组
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        sc.close();

        int result = dfs(weights);
        System.out.println(result);
    }

    private static int dfs(int[] weights) {
        int n = weights.length;
        int targetWeight = 0;
        for (int weight : weights) {
            targetWeight += weight;
        }

        boolean[][] dp = new boolean[n + 1][targetWeight + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = true;
            for (int j = 1; j <= targetWeight; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= weights[i - 1]) {
                    dp[i][j] |= dp[i - 1][j - weights[i - 1]];
                }
            }
        }

        int count = 0;
        for (boolean canCombine : dp[n]) {
            if (canCombine) {
                count++;
            }
        }

        return count;
    }
}
