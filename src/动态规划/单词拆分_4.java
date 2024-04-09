package 动态规划;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 单词拆分_4 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set set = new HashSet();
        set.addAll(wordDict);
        //完全背包
        //代表长度
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        //先遍历背包再遍历物品
        for (int i = 1; i <= s.length(); i++) {
            //遍历物品
            for (int j = 0; j < wordDict.size(); j++) {
                if (i >= wordDict.get(j).length()) {
                    if (s.substring(i - wordDict.get(j).length(), i).equals(wordDict.get(j)) && dp[i - wordDict.get(j).length()]) {
                        dp[i] = true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
