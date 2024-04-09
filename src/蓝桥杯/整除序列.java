package 蓝桥杯;

import java.util.Scanner;

public class 整除序列 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n= sc.nextLong();
        while(true){
            System.out.print(n+" ");
            n/=2;
            if(n==0){
                break;
            }
        }
    }
}
