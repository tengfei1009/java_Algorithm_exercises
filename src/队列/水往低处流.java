package 队列;

import java.util.*;

public class 水往低处流 {
    static boolean[][] visited; // 记录单元格是否已访问
    static int[][] grid; // 存储格子值
    static int n; // 格子的大小
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];

        ArrayList<Cell> cells = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                cells.add(new Cell(i, j, grid[i][j]));
            }
        }
        Collections.sort(cells, (o1, o2) -> o2.value - o1.value);



        // 使用自定义的比较器实现倒序排
        for (int i = 0; i < cells.size(); i++) {
            Cell cell = cells.get(i);
            if (!visited[cell.x][cell.y]) {
                count++;
                dfs(cell.x, cell.y, cell.value);
            }
        }
        System.out.println(count);
    }

    public static void dfs(int x, int y, int current) {
        int mid =current;
        if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        // 如果相邻单元格的值小于当前单元格的值，则将其标记为已访问
        if (x - 1 >= 0 && grid[x - 1][y] < current) {
            current = grid[x - 1][y];
            dfs(x - 1, y, current); // 上
            current = mid;
        }
        if (x + 1 < n && grid[x + 1][y] < current) {
            current = grid[x + 1][y];
            dfs(x + 1, y, current); // 下
            current = mid;

        }
        if (y - 1 >= 0 && grid[x][y - 1] < current) {
            current = grid[x][y-1];
            dfs(x, y - 1, current); // 左
            current = mid;
        }
        if (y + 1 < n && grid[x][y + 1] < current) {
            current = grid[x][y+1];
            dfs(x, y + 1, current); // 右
            current = mid;
        }
    }
}

class Cell {
    int x;
    int y;
    int value;

    public Cell(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}