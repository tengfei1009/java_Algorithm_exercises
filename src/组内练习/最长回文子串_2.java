package 组内练习;

public class 最长回文子串_2 {
    public String longestPalindrome(String s) {
        String res = "";
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substr = s.substring(i, j);
                if (isPalindrome(substr) && substr.length() > maxLength) {
                    maxLength = substr.length();
                    res = substr;
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
