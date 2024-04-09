package 蓝桥杯;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 解谜游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 跳过换行符

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            boolean flag = true;
            Map<Character, Integer> m = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                m.put('G', 0);
                m.put('R', 0);
                m.put('Y', 0);

                m.put(a.charAt(i), m.get(a.charAt(i)) + 1);
                m.put(b.charAt(i), m.get(b.charAt(i)) + 1);
                m.put(c.charAt(i), m.get(c.charAt(i)) + 1);
                m.put(a.charAt(i + 4), m.get(a.charAt(i + 4)) + 1);
                m.put(b.charAt(i + 4), m.get(b.charAt(i + 4)) + 1);
                m.put(a.charAt(i + 8), m.get(a.charAt(i + 8)) + 1);

                if (m.get('G') == 3 && m.get('R') == 2 && m.get('Y') == 1) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}