package 蓝桥杯;

import java.util.Scanner;

public class 螺旋折线_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();//输入x坐标
        long y=sc.nextLong();//输入y坐标
        long judge = Math.max(Math.abs(x),Math.abs(y));
        long inside=0,outside=0;
        for (long i = 0; i < judge; i++) {
            inside+=i*8;
        }
        if(judge ==Math.abs(y)){
            if(y>0)
                outside =3*y+x;
            else outside =7*(-y)-x;
        }
        if(judge ==Math.abs(x)){
            if(x<0) outside=(-x)+y;
            else outside=x*5-y;
        }
        if(x==y&&x==0){
            inside =outside=0;
        }
        System.out.println(inside+outside);
    }
}
