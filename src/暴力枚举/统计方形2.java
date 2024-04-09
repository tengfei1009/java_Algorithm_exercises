package 暴力枚举;

import java.util.Scanner;

public class 统计方形2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        //计算矩形的总个数
        //n*m个小方格,就有n+1 竖线 计算width, m+1 横线计算height;
        //排列组合 Cn+1 2   Cm+1  2
        long ju = ((width+1)*width/2) * ((height+1)*height/2);
        int min = width>height ? height : width;
        long  fang = 0;
        for (long i = 0; i < min; i++) { //总共最大多长的正方形
            fang +=(width-i)*(height-i);
        }
        System.out.println(ju);
        System.out.println(ju-fang);
    }
}
