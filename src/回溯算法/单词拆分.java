package 回溯算法;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 单词拆分 {
    String s;
    List<String> worDict;
    Map <Integer,Boolean> map;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.s =s;
        this.worDict = wordDict;
        map = new HashMap<>();
        return dfs(0);
    }
    private boolean dfs(int start){
        if(start == s.length()){
            return true;
        }
        if(map.containsKey(start)){
            return map.get(start);
        }
        for (String word : worDict) {
            int end = start+word.length();
            if(end<=s.length()&&s.substring(start,end).equals(word)){
                if(dfs(end)){
                    map.put(start,true);
                    return true;
                }
            }
        }
        map.put(start,false);
        return false;
    }
}
