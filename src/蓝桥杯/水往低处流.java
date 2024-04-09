package 蓝桥杯;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 水往低处流 {
    static class Cell {
        int row;
        int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static boolean[][] mark;
    static Queue<Cell> queue = new LinkedList<>();
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        mark = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 存储格子值
                grid[i][j] = sc.nextInt();
            }
        }
        // 遍历所有格子
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i,j,grid);
            }
        }
        // 进行水往低处流的操作
        // 统计水桶数
        System.out.println("水往低处流的水桶数：" + count);
        sc.close();
    }

    private static void dfs(int i, int j, int[][] grid) {
        int n = grid.length;
        boolean pourable = true; // 是否可以进行浇灌的标志
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        // 检查四周格子的值是否都小于当前格子的值
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];
            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] >= grid[i][j]) {
                pourable = false;
                break;
            }
        }
        // 如果可以浇灌，则将当前格子及其四周小格子都标记为已浇灌
        if (pourable) {
            mark[i][j] = true;
            for (int[] direction : directions) {
                int newRow = i + direction[0];
                int newCol = j + direction[1];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !mark[newRow][newCol]) {
                    mark[newRow][newCol] = true;
                    dfs(newRow, newCol,grid);
                }
            }
            count++;
        }
    }
}