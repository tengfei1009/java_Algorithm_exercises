package 力扣数组.一般;

import java.util.Scanner;

public class 螺旋矩阵2 {
    public int[][] generateMatrix(int n) {
        int [][]arr = new int [n][n];
        int x = 0;
        int y = 0;
        //初始化第一个值为1
        int mark = 1;
        arr[x][y] = mark;
        //循环次数,第一个已经标记,从1开始再标记n*n-1次
        while (mark < n *n){
            //首先向右移动
            while (y+1 <n && arr[x][y+1]==0) {
                y++;
                mark++;
                arr[x][y] = mark;
            }
            while(x+1 <n && arr[x+1][y]==0){
                x++;
                mark++;
                arr[x][y] = mark;

            }
            while(y-1>=0 && arr [x][y-1]==0) {
                y--;
                mark++;
                arr[x][y] = mark;

            }
            while (x-1>=0 && arr[x-1][y]==0){
                x--;
                mark++;
                arr[x][y] = mark;

            }
        }
        return arr;
    }
}
