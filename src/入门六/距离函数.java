package 入门六;

import java.util.Scanner;


public class 距离函数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        double result = a+b+c;

        System.out.printf("%.2f",result);
    }
}
