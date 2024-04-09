package 蓝桥杯;

import java.util.Scanner;

public class 平方差_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count =0;
        for (int i = l; i <= r; i++) {
            if(i%4==0||i%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
