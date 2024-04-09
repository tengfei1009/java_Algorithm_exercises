package 动态规划;

import java.util.Scanner;

public class 完全背包 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] materials = new int[n];
        int[] space = new int[n];
        for (int i = 0; i < n; i++) {
            materials[i] = sc.nextInt();
            space[i] = sc.nextInt();
        }
        //装满n个物体,需要的最大空间是多少
        int[] dp = new int[v+1];
        dp[0] =0;
        //遍历物品
        for (int i = 0; i < n; i++) {
            //遍历空间
            for (int j = space[i]; j <= v; j++) {
                dp[j] =Math.max(dp[j],dp[j-space[i]]+space[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
