package 蓝桥杯;

import java.util.Scanner;

public class 取模_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean c = (n > m);
            if (c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
