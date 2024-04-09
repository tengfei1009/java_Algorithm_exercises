package 蓝桥杯;

import java.util.Scanner;

public class 四平方和_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean fa = false;
        //暴力枚举
       ss: for (int a = 0; a * a < n; a++) {
            for (int b = a; a * a + b * b < n; b++) {
                for (int c = b; a * a + b * b + c * c < n; c++) {
                    int k = n - a * a - b * b - c * c;
                    int d = (int) Math.sqrt(k);
                    if (d * d == k) {
                        System.out.println(a + " " + b + " " + c + " " + d + " ");
                        fa= true;
                        break;
                    }
                }
                if(fa){
                    break ss;
                }
            }

        }
    }
}
