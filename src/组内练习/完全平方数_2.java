package 组内练习;

import java.util.Scanner;

public class 完全平方数_2 {
    public static void main(String[] args) {
        //首先一定可以分成两个数
        //分两种情况,找不到,也就是1~最大值,最后返回最大值   或者6*3 当6是3的倍数的时候,可以给3乘一个数,使得这个数变成6*6变成完全平方数
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            int ans =0;
            //出现了一个质因子
            while (n % i == 0) {
                n /= i;
                ans++;
            }
            if(ans%2!=0){ //如果是质数就补上一个质因子
                res*=i;
            }
        }
        res*=n;
        System.out.println(res);
    }
}