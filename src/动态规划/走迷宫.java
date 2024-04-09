package 动态规划;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 走迷宫 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入迷宫的行数：");
        int m = sc.nextInt();
        System.out.println("请输入迷宫的列数：");
        int n = sc.nextInt();

        int[][] maze = new int[m][n];
        System.out.println("请输入迷宫的地图（0表示可通行，1表示障碍物）：");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        System.out.println("请输入起点坐标：");
        int startX = sc.nextInt();
        int startY = sc.nextInt();

        System.out.println("请输入终点坐标：");
        int endX = sc.nextInt();
        int endY = sc.nextInt();

        int steps = solveMaze(m, n, maze, startX, startY, endX, endY);
        System.out.println("最短步数为：" + steps);
    }

    public static int solveMaze(int m, int n, int[][] maze, int startX, int startY, int endX, int endY) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 上下左右四个方向

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});

        boolean[][] visited = new boolean[m][n];
        visited[startX][startY] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int currX = curr[0];
                int currY = curr[1];

                if (currX == endX && currY == endY) {
                    return steps;
                }

                for (int[] dir : directions) {
                    int newX = currX + dir[0];
                    int newY = currY + dir[1];

                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && maze[newX][newY] == 0 && !visited[newX][newY]) {
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }

            steps++;
        }

        return -1; // 无法到达终点
    }
}