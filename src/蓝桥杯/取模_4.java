package 蓝桥杯;

import java.util.*;

public class 取模_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         ss:for (int i = 0; i < t; i++) {
            Set<Integer> set =new HashSet<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int j = 1; j <= m; j++) {
                int mid =n%j;
                if(set.contains(mid)){
                    System.out.println("Yes");
                    continue ss;
                }else {
                    set.add(mid);
                }
            }
            System.out.println("No");
        }
    }
}
