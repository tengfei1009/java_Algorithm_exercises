package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 分割回文字符串 {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return res;
    }

    List<String> current = new ArrayList<>();

    public void backTracking(String s, int startIndex) {
        if(startIndex == s.length()){
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            String substring = s.substring(startIndex, i + 1);
            //截取的是左闭右开
            if (isPalindrome(substring)) {
                current.add(substring);
                backTracking(s, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    //判断是否为回文串
    public boolean isPalindrome(String str) {
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
