package 蓝桥杯;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 水往低处流_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] h = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                h[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int minBuckets = bfs(h);
        System.out.println(minBuckets);
    }

    private static int bfs(int[][] h) {
        int n = h.length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();

        // 将所有高度不为0的格子加入队列
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
            }
        }

        int buckets = 0;

        // 进行BFS遍历
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                // 遍历相邻格子
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    // 检查边界和访问状态
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                        visited[newRow][newCol] = true;

                        // 如果相邻格子的高度大于当前格子，将其设为湿润状态，并加入队列
                        if (h[newRow][newCol] > h[row][col]) {
                            queue.offer(new int[]{newRow, newCol});
                        }
                    }
                }
            }

            // 每次处理完一批湿润格子后，增加水桶数
            buckets++;
        }

        return buckets - 1; // 减去初始的湿润格子
    }
}