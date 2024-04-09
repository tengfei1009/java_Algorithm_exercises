package 动态规划;

import java.util.ArrayList;
import java.util.Arrays;

public class 完全平方数_3 {
    public int numSquares(int n) {
        //最小组合
        int []dp= new int[n+1];
        //容量
        for (int i = 1; i*i <=n; i++) {
            for (int j = i*i; j <= n; j++) {
                if(dp[j]!=0)dp[j]=Math.min(dp[j],dp[j-i*i]+1);
                else dp[j]=dp[j-i*i]+1;
            }
        }
        return dp[n];
    }
}
