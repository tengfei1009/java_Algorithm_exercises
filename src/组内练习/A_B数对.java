package 组内练习;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class A_B数对 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] a = new long[n + 1];
        Map<Long, Long> m = new HashMap<>();
        long ans = 0;

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
//            m.getOrDefault(a[i], 0L)的作用是获取a[i]在m中的出现次数，如果a[i]不存在于m中，则默认出现次数为0。
            m.put(a[i], m.getOrDefault(a[i], 0L) + 1L); //出现的次数加1
            a[i] -= c;
        }

        for (int i = 1; i <= n; i++) {
            ans += m.getOrDefault(a[i], 0L);
        }

        System.out.println(ans);
    }
}
