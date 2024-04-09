package 入门四;

import java.util.Scanner;

public class 工艺品标记 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int h=sc.nextInt();

        int q=sc.nextInt();

        //定义一个三维数组
        int [][][]arr=new int[w+1][x+1][h+1];   //数组的范围是1~w
        //首先对数组内所有元素进行标记,小方块,按单位1来算,最下是单位1,所以从1开始遍历
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= x; j++) {
                for (int k = 1; k <= h; k++) {
                    arr[i][j][k]=1;
                }
            }
        }
//        切割次数
        for(int i=0;i<q;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int z1=sc.nextInt();

            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int z2=sc.nextInt();

            for(int j=x1;j<x2;j++){
                for(int k=y1;k<y2;k++){
                    for(int l=z1;l<z2;l++){
                        arr[j][k][l]=0;
                    }
                }
            }
        }
        int mid=0;
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= x; j++) {
                for (int k = 1; k <= h; k++) {
                    mid++;
                }
            }
        }
        System.out.println(mid);
    }
}
