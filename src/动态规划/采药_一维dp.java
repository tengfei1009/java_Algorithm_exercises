package 动态规划;

import java.util.Scanner;

public class 采药_一维dp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int []dp =new int[n+1];
        int []time =new int[m];
        int []value = new int[m];
        for (int i = 0; i < m; i++) {
            time[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = n; j >=time[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-time[i]]+value[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
