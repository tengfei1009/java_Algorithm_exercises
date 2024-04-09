package 动态规划;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 单词拆分 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        wordBreak("leetcode", list);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set set = new HashSet<>();
        for (String s1 : wordDict) {
                set.add(s1);
        }
        boolean c= false;
        ss: for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (set.contains(s.substring(i,j))) {
                    c= true;
                    break ss;
                }
            }
        }
        return true;
    }
}