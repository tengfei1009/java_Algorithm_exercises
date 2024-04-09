package 搜索;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//广搜
public class 马的遍历 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 棋盘的行数
        int m = sc.nextInt(); // 棋盘的列数
        int x = sc.nextInt(); // 马的起始行坐标
        int y = sc.nextInt(); // 马的起始列坐标

        int[][] steps = new int[n][m]; //存储到达当前坐标的最小步数
        //将默认都设为不可到达
        for (int i = 0; i < n; i++) {
            Arrays.fill(steps[i], -1); //初始化所有的为-1,不可到达的位置
        }

        // 定义马可以走的八个方向
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        Queue<int[]> queue = new LinkedList<>();  //生成一个队列,先进先出后进后出
        queue.offer(new int[]{x, y}); //将起始坐标入队
        steps[x][y] = 0;//起点步数为0

        while (!queue.isEmpty()) { //队列中的元素不为0
            //从队列中取出起始坐标
            int[] curr = queue.poll(); //移除并返回队列头部的元素,如果队列为空则返回null
            int currX = curr[0];
            int currY = curr[1];

            for (int i = 0; i < 8; i++) {//遍历八个方向
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && steps[nextX][nextY] == -1) {
                    steps[nextX][nextY] = steps[currX][currY] + 1; //一直不断更新步数,使得这个棋盘上的值被不断更新
                    queue.offer(new int[]{nextX, nextY});//入队,一直不断入队
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(steps[i][j] + " ");
            }
            System.out.println();
        }

    }
}
