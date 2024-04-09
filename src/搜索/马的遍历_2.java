package 搜索;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 马的遍历_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 棋盘的行数
        int m = sc.nextInt(); // 棋盘的列数
        int x = sc.nextInt() - 1; // 马的起始行坐标
        int y = sc.nextInt() - 1; // 马的起始列坐标

        int[][] steps = new int[n][m]; // 存储最少步数的矩阵
        for (int i = 0; i < n; i++) {
            Arrays.fill(steps[i], -1); // 初始化矩阵为-1，表示未访问过的位置
        }

        // 定义马可以走的八个方向
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        steps[x][y] = 0; // 起点步数为0

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();//出队列
            int currX = curr[0];
            int currY = curr[1];

            for (int i = 0; i < 8; i++) {
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && steps[nextX][nextY] == -1) {
                    steps[nextX][nextY] = steps[currX][currY] + 1;//走一步
                    queue.offer(new int[]{nextX, nextY});//然后入队列,直到走不动为止,也就是队列为空
                }
            }
        }

        // 输出最少步数矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(steps[i][j] + " ");
            }
            System.out.println();
        }
    }
}