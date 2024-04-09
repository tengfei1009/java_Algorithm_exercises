package 蓝桥杯.第十四届;

import java.util.Scanner;

public class 矩形总面积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextInt();
        long y1 = sc.nextInt();
        long x2 = sc.nextInt();
        long y2 = sc.nextInt();
        long x3 = sc.nextInt();
        long y3 = sc.nextInt();
        long x4 = sc.nextInt();
        long y4 = sc.nextInt();

        //判断是否重合
         long width =x2-x1+x4-x3 -Math.abs(Math.max(x4,x2)-Math.min(x1,x3));
         if(width<0){
             width=0;
         }
         long height =y4-y3+y2-y1 -Math.abs(Math.max(y4,y2)-Math.min(y1,y3));
         if(height<0){
             height=0;
         }
         long mid =height*width;
         long s = (x2-x1)*(y2-y1)+(x4-x3)*(y4-y3)-mid;
        System.out.println(s);
    }
}
