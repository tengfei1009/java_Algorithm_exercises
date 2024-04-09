package 组内练习;

public class 回文子串 {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] arr = new boolean[n][n];
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) { // 修改此处，遍历整个数组或下三角部分
                if (i == j) {
                    arr[i][j] = true;
                } else if (j - i <= 2) {
                    arr[i][j] = s.charAt(i) == s.charAt(j);
                } else if (j - i > 1) {
                    arr[i][j] = s.charAt(i) == s.charAt(j) && arr[i + 1][j - 1];
                }
                if (arr[i][j]) { // 修改此处，只计算 arr[i][j] 为 true 的次数
                    count++;
                }
            }
        }
        return count;
    }

//    private boolean isPalindrome(String str) {
//
//    }
}