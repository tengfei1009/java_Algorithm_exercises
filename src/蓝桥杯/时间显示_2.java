package 蓝桥杯;

import java.util.Scanner;

public class 时间显示_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        //得到秒数
        n/=1000;
        //得到一天以内的秒数,再除以时间
        long h = n%(60*60*24)/(60*60);
        //得到一个小时内的秒数
        long m = n%(60*60)/60;
        long s =n%60;//得到剩余秒数
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}
