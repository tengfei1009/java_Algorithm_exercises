package 入门四;

import java.util.Scanner;

public class 蛇形方阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int x = 0;  // 记录当前横坐标
        int y = 0;  // 记录当前纵坐标
        int mark = 1; // 标记数值
        arr[x][y] = mark;  // 第一个数默认标记为1

        while (mark < n * n) { // 总共标记n*n个数，标记数最大为n*n-1个
            // 向右填充
            //y+1 因为是从1开始的,因为 y= 0 初始化第一个位置已经被占用了
//            这个位置还没有被填充时,执行
            while (y + 1 < n && arr[x][y + 1] == 0) {
                y++;
                mark++;
                arr[x][y] = mark;
            }

            // 向下填充
            while (x + 1 < n && arr[x + 1][y] == 0) {
                x++;
                mark++;
                arr[x][y] = mark;
            }

            // 向左填充
            //y因为++,现在指向倒数第二个位置
            while (y - 1 >= 0 && arr[x][y - 1] == 0) {
                y--;
                mark++;
                arr[x][y] = mark;
            }

            // 向上填充
            //因为向上填充,所以x-1,向上一位
            while (x - 1 >= 0 && arr[x - 1][y] == 0) {
                x--;
                mark++;
                arr[x][y] = mark;
            }
        }

        // 输出矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
