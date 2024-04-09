package 蓝桥杯;
import java.util.Scanner;

public class 取模_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean c = false;
            int[] res = new int[m];

            for (int i = 1; i <= Math.min(n, m); i++) {
                int mid = n % i;
                res[mid]++;
                if (res[mid] >= 2) {
                    c = true;
                    break;
                }
            }

            if (c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}