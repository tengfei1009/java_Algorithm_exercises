package 动态规划;

import java.util.Scanner;

public class 接龙数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }

        for (int i = 1; i < n; i++) {
            if (nums[i].charAt(0) == nums[i - 1].charAt(nums[i - 1].length() - 1)) {
                dp[i][0] = dp[i - 1][1];
            } else {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            }

            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]) + 1;

        }
        System.out.println(n - Math.max(dp[n-1][0], dp[n-1][1]));
    }
}