package 队列;

public class 最长有效括号_3 {
    //dp,动态规划
    public int longestValidParentheses(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (s.charAt(i - 1) == ')' && i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    //中间的,加上当前+2,加上这当前这个前面所有连续的
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                }
                //存储最大子序列
                if (dp[i] > res) {
                    res = dp[i];
                }
            }
        }
        return res;
    }
}
