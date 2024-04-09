package 动态规划;

public class 最长回文子串 {
    public String longestPalindrome(String s) {
        int n = s.length();
        //dp数组的含义是1~n区间;
        int res =1;
        int startId =0;
        int endId = 1;
        boolean[][] dp = new boolean[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    //相邻
                    if(j+1==i){
                        dp[j][i] = true;
                        //不相邻,判断内层是否为回文子串
                    }else if(dp[j+1][i-1]){
                        dp[j][i] =true;
                    }
                    if(dp[j][i] &&i-j+1>res){
                        res = i-j+1;
                        startId =j;
                        endId =i+1;
                    }
                }
            }
        }
        return s.substring(startId,endId);
    }
}