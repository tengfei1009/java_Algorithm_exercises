package 蓝桥杯;

import java.util.Scanner;

public class 异或和之和 {
    public static final int num = 65;
    public static final int maxx = 110000;
    public static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] all = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            all[i] = scanner.nextInt();
        }

        int[][] dp = new int[maxx][num];
        int[][] ans = new int[maxx][num];
        int ans1 = 0;

        for (int i = 1; i <= n; i++) {
            int[] er = new int[num];
            int val = all[i];

            // 将 all[i] 转换为二进制表示，并存储在 er 数组中
            for (int j = 1; j <= num; j++) {
                er[j] = val % 2;
                val /= 2;
            }

            // 将二进制表示存储在 ans 数组中
            for (int j = 1; j <= num; j++) {
                ans[i][j] = er[j];
            }
        }

        // 计算 dp 数组
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                if (ans[i][j] != ans[i - 1][j]) {
                    dp[i][j]++;
                }

                if (ans[i][j] == 1) {
                    dp[i][j] += (i - 2 - dp[i - 1][j]);
                } else {
                    dp[i][j] += dp[i - 1][j];
                }
            }
        }

        // 计算 ans1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                ans1 += dp[i][j] * (1 << (j - 1));
            }
        }

        // 将 all 数组中的元素累加到 ans1
        for (int i = 1; i <= n; i++) {
            ans1 += all[i];
        }

        System.out.println(ans1);
    }
}