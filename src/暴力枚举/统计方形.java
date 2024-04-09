package 暴力枚举;

import java.util.Scanner;

public class 统计方形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = m > n ? n : m;
//        System.out.println(min);
        int x = 0;
        long sum = 0, sum1 = 0;
        for (int i = 1; i <= n; i++) {//i和j作为枚举变量，n和m作为枚举变量的范围
            for (int j = 1; j <= m; j++) {
                sum += i * j;//所有矩形的个数
            }
            while (x < min) {
                sum1 += (n - x) * (m - x);
                x++;
            }
        }
        System.out.print(sum1+" "+(sum-sum1));

    }
}