package 蓝桥杯;

import java.util.Scanner;

public class 小平方 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double mid = n/2;
        int count=0;
        for (int i = 1; i < n; i++) {
            if(i*i%n<mid){
                count++;
            }
        }
        System.out.println(count);
    }
}
