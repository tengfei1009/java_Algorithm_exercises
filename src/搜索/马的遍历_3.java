package 搜索;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 马的遍历_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        //定义一个矩阵
        int[][] steps = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(steps[i], -1);
            }
        }
        //定义一个队列,入队的是一对坐标,用数组存储
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});//匿名数组
        steps[x][y] = 0;//从该点开始
        int[] dx = {-1, 1, -2, 2, -2, 2, -1, 1};
        int[] dy = {2, 2, 1, 1, -1, -1, -2, -2};

        while (!queue.isEmpty()) {
            //定义一个数组,存储当前出队列的数据
            int[] curr = queue.poll();//移除队头元素
            int currX = curr[0];
            int currY = curr[1];
            //遍历八个方向,不断入队,不断遍历八个方向
            for (int i = 0; i < 8; i++) {
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && steps[nextX][nextY]==-1) {
                    steps[nextX][nextY] = steps[currX][currY] + 1;
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }
        for (int i = 0; i < steps.length; i++) {
            for (int j = 0; j < steps[0].length; j++) {
                System.out.print(steps[i][j] + " ");
            }
            System.out.println();
        }
    }
}
