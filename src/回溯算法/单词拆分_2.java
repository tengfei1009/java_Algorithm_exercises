package 回溯算法;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 单词拆分_2 {
    Map<String, Boolean> cache = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        // 如果字符串为空，则可以拆分，返回 true
        if (s.isEmpty()) {
            return true;
        }

        // 如果结果已经计算过，则直接返回缓存中的结果
        if (cache.containsKey(s)) {
            return cache.get(s);
        }

        boolean res = false; // 记录拆分结果，默认为 false

        for (String str : wordDict) {
            if (str.equals(s)) {
                // 如果当前单词与字符串相等，说明可以拆分，设置结果为 true，并跳出循环
                res = true;
                break;
            } else if (s.startsWith(str)) {
                // 如果字符串以当前单词开头，则递归判断剩余部分的字符串是否可以拆分
                res = wordBreak(s.substring(str.length()), wordDict);
                if (res) {
                    // 如果剩余部分可以拆分，则设置结果为 true，并跳出循环
                    break;
                }
            }
        }

        // 将结果存入缓存
        cache.put(s, res);

        return res;
    }
}
