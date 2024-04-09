package 组内练习;

import java.util.Scanner;

public class 完全平方数_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if (Math.sqrt(n) % 1 == 0) {
            System.out.println(1);
            System.exit(0);
        }
        for (double i = (int) Math.sqrt(n); i >= 2; i--) {
            if (n % i == 0) {
                double temp = n / i;
                double a = Math.max(temp, i);
                double b = Math.min(temp, i);
                if (a % b == 0) {
                    System.out.println(Math.round(a / b));
                    System.exit(0);
                }
            }
        }
        System.out.println(Math.round(n));
    }
}
