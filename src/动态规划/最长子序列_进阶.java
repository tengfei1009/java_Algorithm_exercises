package 动态规划;

public class 最长子序列_进阶 {
    public String LCS(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m == 0 || n == 0) {
            return "-1";
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--;
                j--;
            } else {
                if(dp[i][j-1]>dp[i-1][j]){
                    j--;
                } else {
                    i--;
                }
            }
        }
     if(sb.length()==0){
         return "-1";
     }
     return sb.reverse().toString();
    }
}
