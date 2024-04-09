package 组内练习;

public class 最长回文子串_5 {
    public static void main(String[] args) {

        System.out.println( longestPalindrome("cbbd"));
    }
    public static String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        System.out.println(res.length());
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (j - i + 1 > res.length() && isPalindrome(s, i, j)) {
                    res = s.substring(i, j+1);
                }
            }
        }
        return res;
    }
    private static boolean isPalindrome(String str, int l, int r) {
        while (l <= r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}