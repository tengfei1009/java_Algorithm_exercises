package 动态规划;

import java.util.Scanner;

public class 斐波那契数 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
    }
    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) +fib(n-2);
    }
}
