package 蓝桥杯;

import java.util.Scanner;

public class 解码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String res =""+ n.charAt(0);
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) <= '9') {
                for (int j = 0; j < n.charAt(i)-'0'-1; j++) {
                    res += n.charAt(i - 1);
                }
                continue;
            }
            res+=n.charAt(i);
        }
        System.out.println(res);
    }
}
