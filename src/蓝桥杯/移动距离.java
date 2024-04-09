package 蓝桥杯;

import java.util.Scanner;

public class 移动距离 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int line = 0;
        if (10000 % w == 0) {
            line = 10000 / w;
        } else {
            line = 10000 / w + 1;
        }
        int[][] nums = new int[line][w];
        int k = 1;

        int row = 0; // 当前正在打印的行
        int column = 0; // 当前正在打印的列
        boolean bo = true; // 为true时从左向右打印，为false时从右往左打印

        while (row < line && column < w) {
            if (bo) {
                // 从左向右打印
                while (column < w) {
                    nums[row][column++] = k++;
                }
                column--;
            } else {
                // 从右往左打印
                while (column >= 0) {
                    nums[row][column--] = k++;
                }
                column++;
            }

            row++;
            bo = !bo; // 切换打印方向

            if (row == line) {
                break;
            }
        }
// 打印矩阵
//        for (int i = 0; i < line; i++) {
//            for (int j = 0; j < w; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
        boolean boo1 = false;
        boolean boo2 = false;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < w; j++) {
                if (nums[i][j] == m) {
                    x1 = i;
                    y1 = j;
                    boo1 = true;
                }
                if (nums[i][j] == n) {
                    x2 = i;
                    y2 = j;
                    boo2 = true;
                }
                if (boo1 && boo2) {
                    int cc = Math.abs(x1 - x2)+Math.abs(y1-y2);
                    System.out.println(cc); //输出最短距离
                    return;
                }
            }
        }
    }
}
