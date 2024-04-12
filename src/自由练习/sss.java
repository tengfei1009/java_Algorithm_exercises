package 自由练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class sss {
    public static void main(String[] args) {
//        System.out.println(gcd(12, 3));
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        Set<String> key = scores.keySet();
//        if(scores.containsKey()){
//
//        }

        Set<Map.Entry<String,Integer>> value =scores.entrySet();
        for (Map.Entry<String, Integer> ss : value) {
            System.out.println(ss.getKey());
        }
    }




    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}