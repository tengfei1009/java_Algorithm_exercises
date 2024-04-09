package 组内练习;

public class 最长回文子串_3 {
    //中心扩散法
    String res;
    public String longestPalindrome(String s) {
        res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            extendFromCenter(s, i, i);
            extendFromCenter(s, i, i + 1);
        }
        return res;
    }

    private void extendFromCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        if (right - left - 1 > res.length()) {
            res = str.substring(left + 1, right);
        }
    }
}
