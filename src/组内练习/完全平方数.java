package 组内练习;

import java.util.Scanner;

public class 完全平方数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean check = true;
        //判断是否为一个质数,如果为质数就返回他自己
//        for (long i = 2; i < Math.sqrt(n); i++) {
//            if(n%i==0)
//            {
//                check = false;
//                break;
//            }
//        }
//        //如果是质数那么最小的就是它自己
//        if(check){
//            System.out.println(n);
//        }else {
        for (long i = 1; i <= n; i++) {
            long mid = (long) Math.sqrt(n * i);
            if (mid * mid == i * n) {
                System.out.println(i);
                break;
            }
        }
    }
}
