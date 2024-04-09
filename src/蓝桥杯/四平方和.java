package 蓝桥杯;

import java.util.Scanner;

public class 四平方和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (4 * i * i > n) {
                break;
            }
            for (int j = i; j < n; j++) {
                if (i * i + 3 * j * j > n) {
                    break;
                }
                for (int k = j; k < n; k++) {
                    if (i * i + j * j + 2 * k * k > n) {
                        break;
                    }
                    int l = (int) Math.sqrt(n - i * i - j * j - k * k);
                    if (i * i + j * j + k * k + l * l == n) {
                        System.out.println(i + " " + j + " " + k + " " + l);
                    }
                }
            }
        }
    }
}