package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 分割回文串_2 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return res;
    }

    List<String> current = new ArrayList<>();
    public void backTracking(String s, int startIndex) {
        //如果说遍历完毕,将合格的字符串添加并返回
        if (startIndex == s.length()) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            String substring = s.substring(startIndex, i + 1);
            if (substring.length() ==1 || isPalindrome(substring)) {
                current.add(substring);
                //递归截取前面符合条件的,然后继续递归符合条件的子串,最后得到一个组合
                backTracking(s, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    // 判断是否为回文串
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
