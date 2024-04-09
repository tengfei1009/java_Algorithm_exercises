package 蓝桥杯;

import java.util.Scanner;

public class 平方差 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int count=0;
        for (int i = 1; i <= R; i++) {
            if(L-1<R&&L+1<=R){
                count++;
                L++;
            }
        }
        System.out.println(count);
    }
}
