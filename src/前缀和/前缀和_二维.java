package 前缀和;

import java.util.Scanner;
import java.util.Scanner;

public class 前缀和_二维 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 矩阵的行数
        int m = sc.nextInt(); // 矩阵的列数
        int q = sc.nextInt(); // 查询的次数

        int count = 0; // 统计子矩阵的和
        int[][] sum = new int[n + 1][m + 1]; // 存储前缀和数组

        // 读取矩阵元素，并计算二维前缀和数组
        for (int i = 1; i < sum.length; i++) {
            for (int j = 1; j < sum[0].length; j++) {
                sum[i][j] = sc.nextInt();
            }
        }

        // 计算二维前缀和数组
        for (int i = 1; i < sum.length; i++) {
            for (int j = 1; j < sum[0].length; j++) {
                // 计算以当前位置为右下角的子矩形的和，利用动态规划的思想
                sum[i][j] += sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }
//        diff[i][j] = arr[i][j] - arr[i-1][j] - arr[i][j-1] + arr[i-1][j-1];

        // 进行查询，计算子矩阵的和
        for (int i = 0; i < q; i++) {
            int x1 = sc.nextInt(); // 子矩阵的左上角行坐标
            int y1 = sc.nextInt(); // 子矩阵的左上角列坐标
            int x2 = sc.nextInt(); // 子矩阵的右下角行坐标
            int y2 = sc.nextInt(); // 子矩阵的右下角列坐标

            // 根据前缀和数组计算子矩阵的和
            count = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];

            System.out.println(count); // 输出子矩阵的和
            count = 0; // 重置计数器
        }
    }
}