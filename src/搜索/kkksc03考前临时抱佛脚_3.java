package 搜索;

import java.util.Scanner;

public class kkksc03考前临时抱佛脚_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4]; // 每科题目数量
        int[][] time = new int[4][]; // 每道题目所需时间
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            // 开辟空间
            time[i] = new int[num[i]];
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < time[i].length; j++) {
                time[i][j] = sc.nextInt();
            }
        }
        int sum =0;
        int res = 0;
        int target =0;
        // 左右脑时间接近一半就是正解
        // 遍历每一科
        for (int i = 0; i < num.length; i++) {
            // 获取每一科的时间
            // 求出这一科，一题一题做的总时间，那么两道题一起做最短时间就是两部分的最小差值，最小差值为0，也就是两个部分相等的时候
            // 也就是说最短时间是一题一题做时间的一半
            for (int j = 0; j < time[i].length; j++) {
                sum+=time[i][j];
            }
            target = sum/2;
            int[] dp = new int[target + 1];
            for(int j=0;j<time[i].length;j++) {
                for(int k=target;k>=time[i][j];k--) {
                    dp[k]=Math.max(dp[k], dp[k-time[i][j]]+time[i][j]);
                }
            }
            //因为sum减去这个,一定大于等于,最短时间
            res +=(sum-dp[target]);
            //重置时间
            sum =0;
        }
        System.out.println(res);
    }
}
