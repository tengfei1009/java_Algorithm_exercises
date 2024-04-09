package 蓝桥杯;

import java.util.Scanner;

public class 移动距离_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        m--;
        n--;

        int X1 = m / w;
        int X2 = n / w;
        int Y1 = m % w;
        int Y2 = n % w;

        if (X1 % 2 == 1)
            Y1 = w - 1 - Y1;
        if (X2 % 2 == 1)
            Y2 = w - 1 - Y2;

        int distance = Math.abs(X1 - X2) + Math.abs(Y1 - Y2);
        System.out.println(distance);
    }
}