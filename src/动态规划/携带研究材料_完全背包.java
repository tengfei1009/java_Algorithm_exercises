package 动态规划;

import java.util.Scanner;

public class 携带研究材料_完全背包 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        //dp数组的含义是携带最大价值的背包
        int [] dp= new int[v+1];
        dp[0] =0;
        //遍历物品
        for (int i = 0; i < n; i++) {
            //遍历容量,只有放得下才放
            for(int j = weight[i];j<=v;j++){
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }
        System.out.println(dp[v]);
    }
}