package 蓝桥杯;

import java.util.Scanner;

public class 刷题统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long week = a*5+b*2;//一周的题
        long day =0;
        int today =1;
        //满一个星期的加上
        if(n/week!=0){
            day =day+n/week*7;
            n=n%week;//这个是剩下一周的题
        }
        while(n>0){
            if(today<=5){   //周一到周五
                n-=a;
            }
            else{          //周六到周日
                n-=b;
            }
            today++;
            day++;
        }
        System.out.println(day);
    }
}
