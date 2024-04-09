package 卡码网;

import java.util.Scanner;

public class 携带矿石资源 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();  //容量
        int n = sc.nextInt();  //种类

        int[] value = new int[n];
        int[] weight = new int[n];
        int[] count = new int[n];
        //每种的重量
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        //每种的价值
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        //每种的数量
        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
        }
        //最大c容量可以装多少价值的东西
        int[] dp = new int[c + 1];
        //先遍历物品
        for (int i = 0; i < n; i++) {
            //遍历容量
            for (int k = c; k >= weight[i]; k--) {
                //遍历物品数量
                for (int j = 1; j <= count[i]; j++) {
                    if(k-weight[i]*j>=0){
                        dp[k] = Math.max(dp[k], dp[k - weight[i] * j] + value[i] * j);
                    }
                }
            }
        }
        System.out.println(dp[c]);
    }
}
