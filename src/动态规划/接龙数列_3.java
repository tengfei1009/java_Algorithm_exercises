package 动态规划;
import java.util.Scanner;


//状态转移
public class 接龙数列_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入的数列长度
        int[] a = new int[n + 1]; // 存储数列的数组
        int[][] dp = new int[n + 2][10]; // 动态规划数组，dp[i][j]表示截止到第i个数，以数字j结尾的最小接龙长度

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt(); // 读取数列中的每个数字
        }

        for (int i = 1; i <= n; i++) {
            // 不选这个数
            for (int j = 0; j < 10; j++) {
                dp[i][j] = dp[i - 1][j] + 1; // 当不选第i个数时，以数字j结尾的最小接龙长度为前一个数的以数字j结尾的最小接龙长度加1
            }
            // 选这个数
            int first = getFirst(a[i]); // 获取第i个数的最高位数字
            int last = getLast(a[i]); // 获取第i个数的个位数字
            dp[i][last] = Math.min(dp[i - 1][first], dp[i][last]); // 当选第i个数时，以数字last结尾的最小接龙长度为前一个数的以数字first结尾的最小接龙长度和当前值的较小值
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            ans = Math.min(ans, dp[n][i]); // 找到最后一个数的以各个数字结尾的最小接龙长度的最小值
        }
        System.out.println(ans); // 输出最小接龙长度
    }

    // 获取一个数的最高位数字
    public static int getFirst(int n) {
        int res = 0;
        while (n > 0) {
            res = n % 10;
            n /= 10;
        }
        return res;
    }

    // 获取一个数的个位数字
    public static int getLast(int n) {
        return n % 10;
    }
}