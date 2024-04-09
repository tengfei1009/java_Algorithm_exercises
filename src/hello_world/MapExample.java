package hello_world;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // 创建一个 HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // 使用 entrySet() 获取键值对的集合
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();

        // 遍历键值对集合并输出每个键值对
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}