package 蓝桥杯;

import java.util.Scanner;

public class 取模 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean c=false;
           ss:for (int i = 1; i < m-1; i++) {
                for (int j = i; j < m; j++) {
                    if(n%i==n%j){
                        c = true;
                        break ss;
                    }
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