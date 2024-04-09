package 动态规划;

import java.util.List;

public class 单词拆分_3 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] step = new boolean[s.length()+1];
        step[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for(int j = 0;j<i &&!step[i];j++){
                if(step[j] && wordDict.contains(s.substring(j,i))){
                    step[i] = true;
                    break;
                }
            }
        }
        return step[s.length()];
    }
}