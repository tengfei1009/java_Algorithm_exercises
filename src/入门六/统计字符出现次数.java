package 入门六;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 统计字符出现次数 {
    public static void main(String[] args) {
        // 定义字符串
        String string = "fdafasfsfasf";

// 定义map容器
        Map<Character, Integer> map = new HashMap<Character, Integer>();

// 遍历字符串，统计字符出现的次数
        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);

            // 判断字符是否已存在于map中
            if (map.containsKey(ch)) {
                // 如果存在，获取字符的出现次数，并加1
                int count = map.get(ch);
                count = count + 1;
                map.put(ch, count);
            } else {
                // 如果不存在，将字符添加到map中，并设置出现次数为1
                map.put(ch, 1);
            }
        }

// 遍历map集合，输出每个字符及其出现次数
        Set<Character> keySet = map.keySet();
        for (Character chars : keySet) {
            System.out.println("字符:" + chars + "，出现的次数为：" + map.get(chars));
        }
    }
    // 获取一个字符串，查找这个字符串出现的次数; 输入abcabcacb ,"a" 输出3
    public static int getStringCount(String str, String key) {
        int count = 0;
        int index = 0;
        int num = str.indexOf(key);
        while ((index = str.indexOf(key)) != -1) {
            count++;
            str = str.substring(str.indexOf(key) + key.length());
        }
        return count;
    }
}
