package 组内练习;

public class 最长回文子串 {
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] arr = new boolean[n][n];
        String res = s.substring(0,1);

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    arr[i][j] = true;
                } else if (j - i <= 2) {
                    arr[i][j] = s.charAt(i) == s.charAt(j);
                } else if (j - i > 1) {
                    arr[i][j] = s.charAt(i) == s.charAt(j) && arr[i + 1][j - 1];
                }

                if (arr[i][j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;
    }
}
