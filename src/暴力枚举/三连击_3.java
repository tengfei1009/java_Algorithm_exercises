package 暴力枚举;

import java.util.Scanner;

public class 三连击_3 {
    static int s[] = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            int k1 = i * a, k2 = i * b, k3 = i * c, flag = 1;
            if (k1 > 999 || k2 > 999 || k3 > 999) break;
            f(k1);
            f(k2);
            f(k3);
            for (int j = 1; j <= 9; j++) {
                if (s[j] == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(k1 + " " + k2 + " " + k3);
                ans++;
            }

        }
        if (ans == 0) System.out.println("No!!!");
    }

    public static void f(int n) {
        s[n % 10] = 1;
        s[n / 10 % 10] = 1;
        s[n / 100] = 1;
    }
}
