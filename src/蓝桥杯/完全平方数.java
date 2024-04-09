package 蓝桥杯;

import java.util.Scanner;

public class 完全平方数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();//需要被改造的数
        long x=1;
        for (long i = 2; i*i <= n; i++) {
            int ans=0;
            while (n%i==0){ //出现了一个质因子
                ans++;
                n/=i;
            }
            if(ans%2!=0){
                x*=i;
            }
        }
        x*=n;
        System.out.println(x);
    }
}
