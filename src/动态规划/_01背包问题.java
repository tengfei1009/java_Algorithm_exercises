package 动态规划;

import java.util.Scanner;

public class _01背包问题 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //一共多少种
        int M = sc.nextInt();
        //背包的空间有多少
        int N = sc.nextInt();

        //每种材料所占的空间
        int []weight = new int[M];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = sc.nextInt();
        }
        //每种材料的研究价值
        int []value = new int[M];
        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextInt();
        }

        //定义dp数组
        int [][]dp = new int[M][N+1];

        //初始化边界
        //初始化第一行
//        0~N空间
        for (int i = 0; i <= N; i++) {
            if(weight[0]<=i){
                dp[0][i] = value[0];
            }else {
                dp[0][i] = 0;
            }
        }
        //初始化第一列
        for (int i = 0; i < M; i++) {
            dp[i][0] =0;
        }



//        怎么带才能携带最大价值的研究材料
        //定义dp数组,数组表达的含义是,当前容量所能携带的最大价值
        for (int i = 1; i < weight.length; i++) {  //遍历科研物品
            //N是背包的空间
            for (int j = 1; j <= N; j++) {  //遍历容量
                //如果装不下这个物品,那么就继承dp[i-1][j]的值,就不装这个value
                if(j<weight[i]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    //装得下看,值更新为不装这个物品的最大值,和装这个物品的最大值中的最大值
                    dp[i][j] = Math.max(dp[i-1][j-weight[i]] +value[i],dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[M-1][N]);
    }
}
