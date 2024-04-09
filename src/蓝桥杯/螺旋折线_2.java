package 蓝桥杯;

import java.util.Scanner;

public class 螺旋折线_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long X=sc.nextLong();//输入x坐标
        long Y=sc.nextLong();//输入y坐标
        sc.close();
        //1. 判断当前点属于第几个正方形
        long n=Math.max(Math.abs(X), Math.abs(Y));
        //2. 计算当前点所属正方形的之前的正方形的长度和，利用等差数列的求和公式
        long s=4*n*(n-1);
        //3. 接下来计算当前点在所属正方形所走过的轨迹之和
        long x=X-(-n),y=Y-(-n);
        long s1=0;
        //3.1考虑不同情况计算
        if(Y>X) {
            s1+=x+y;
        }else {
            s1+=8*n-x-y;
        }
        System.out.println(s+s1);
    }
}