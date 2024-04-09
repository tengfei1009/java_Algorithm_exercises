package 动态规划;

import java.util.Scanner;

public class 爬楼梯_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //需要爬n阶才能到达楼顶
        int n = sc.nextInt();
        //每次最多爬m个台阶
        int m = sc.nextInt();
//        dp数组的含义是到达当前台阶有多少种方法
        int[]dp =new int[n+1];
        dp[0] =1;
        //先遍历背包,也就是走到第几阶台阶
        for (int i = 1; i <= n; i++) {
            //再遍历物品，也就是一次走几阶台阶
            for (int j = 1; j <= m; j++) {
                if(i>=j){
                    dp[i] += dp[i-j];
                }
            }
        }
        System.out.println(dp[n]);
    }
}
