package 动态规划;

import java.util.HashSet;
import java.util.List;

public class 单词拆分_2 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        //单个单词就是物品,组成的词汇就是背包
        //字符串的长度为i
        //当前长度为true就可以继续往后推
         boolean[] valid =new boolean[s.length()+1];
         //集合去重
        HashSet<String> set = new HashSet<>(wordDict);
        valid[0] = true; //从长度为0开始往后推
        //求的是排列数,先遍历背包再遍历物品
        for (int i = 1; i <= s.length(); i++) {
            //遍历物品,判断截取单词是否在字典中
            for(int j =0; j<i && !valid[i];j++){
                String mid = s.substring(j,i);
                if(set.contains(mid) && valid[j]){
                    valid[i] =true;
                }
            }
        }
        return valid[s.length()];
    }
}