package 蓝桥杯;

import java.util.Scanner;

public class 时间显示 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong();
        time/=1000; //得到秒数
        long h =time%(60*60*24)/(60*60);//得到小时
        long t =time%(60*60)/60;
        long s = time%60;
        System.out.printf("%02d:%02d:%02d",h,t,s);
    }
}
