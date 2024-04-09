package 力扣数组.简单;

import java.util.LinkedHashMap;

public class _819最常见单词 {
    //找出除禁用词以外最大的词
    public String mostCommonWord(String paragraph, String[] banned) {
        //大写变小写
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace(",", " ").replace(".", " ").replace("!", " ").replace("?", " ").replace(";", " ").replace("'", " ");
        String[] par = paragraph.split(" ");

        //线性哈希表将不重复且不被禁止的数据存入
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : par) {
            if (findNoSame(word, banned)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        //遍历Map 找到value最大的值
        int max = 0;
        String ret = "";
        for (String key : map.keySet()) {
            if(max < map.get(key) || max == map.get(key) && key.compareTo(ret) < 0){
                max = map.get(key);
                ret = key;
            }
        }
        return ret;
    }
    //判断word是否被禁止
    private static boolean findNoSame(String word, String[] banned) {
        for (int i = 0; i < banned.length; i++) {
            if(word.equals(banned[i]) || word.equals(" ") || word.equals("")){
                return false;
            }
        }
        return true;
    }
}
