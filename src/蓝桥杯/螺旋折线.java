package 蓝桥杯;

import java.util.Scanner;

public class 螺旋折线 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long X = in.nextLong();
        long Y = in.nextLong();
       // 首先判断点(X, Y)所在的正方形，取X和Y的绝对值的最大值作为正方形的边长n。
        long n = Math.max(Math.abs(X), Math.abs(Y));

        // 1. 之前正方形的长度和
        long Sn = 4 * (n - 1) * n;

        // 2. 计算点(-n, -n) 到点(X, Y)的距离, 考虑清楚情况
        long sum = 0;
        long px = -n, py = -n;
        long d1 = X - px, d2 = Y - py;
        if (Y > X) {  //如果Y大于X，说明点(X, Y)在正方形的右上区域，距离为d1+d2。
            sum += (d1 + d2);
        } else {
            sum += (8 * n - d1 - d2);  //如果Y小于等于X，说明点(X, Y)在正方形的左下区域，距离为8*n-d1-d2。
        }
        System.out.println(sum + Sn);  //输出距离和之前正方形长度和的总和，即为点(X, Y)所在的长度和。
    }
}