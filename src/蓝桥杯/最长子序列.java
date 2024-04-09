package 蓝桥杯;

import java.util.Scanner;

public class 最长子序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int start = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (start<T.length()&&S.charAt(i) == T.charAt(start)) {
                start += 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
