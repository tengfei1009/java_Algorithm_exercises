package 入门六;


import java.util.Scanner;

public class 赦免战俘 {
    static int size; // 矩阵的大小
    static boolean[][] ans; // 结果矩阵
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder(); // 用于存储结果矩阵

    public static void main(String[] args) {
        int n = sc.nextInt(); // 输入的 n 值
        size = (int) Math.pow(2, n); // 计算矩阵的大小
        ans = new boolean[size][size]; // 创建结果矩阵

        dfs(0, 0, size - 1, size - 1); // 开始深度优先搜索
        printMatrix(ans); // 打印结果矩阵
    }

    private static void dfs(int x, int y, int xx, int yy) {//范围
        if (x == xx && y == yy) // 如果到达边界，结束递归(1,1)
            return;

        int tx = (x + xx) / 2; // 子矩阵的中点横坐标
        int ty = (y + yy) / 2; // 子矩阵的中点纵坐标

        for (int i = x; i <= tx; i++) {
            for (int j = y; j <= ty; j++) {
                ans[i][j] = true; // 将子矩阵内的元素置为 true，表示赦免战俘
            }
        }

        dfs(x, ty + 1, tx, yy); // 递归搜索右上子矩阵
        dfs(tx + 1, y, xx, ty); // 递归搜索左下子矩阵
        dfs(tx + 1, ty + 1, xx, yy); // 递归搜索右下子矩阵
    }

    private static void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(matrix[i][j] ? 0 : 1);
                sb.append((j == size - 1) ? '\n' : ' ');
            }
        }
        System.out.print(sb.toString()); // 打印结果矩阵
//                System.out.printf("%d%c",2,'#');
//                System.out.printf("%d%c", matrix[i][j] ? 0 : 1, (j == size - 1) ? '\n' : ' ');
        // 打印结果矩阵，将 true 转换为 0，false 转换为 1
//                pw.flush();
    }
}