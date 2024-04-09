package 暴力枚举;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 八皇后5 {
    static int[][] ack;
    static char[][] que;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ack = new int[n][n];
        que = new char[n][n];

        init(n);
        dfs(0, n);

        System.out.println(cnt);
    }

    private static void init(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ack[i][j] = 0;
                que[i][j] = '.';
            }
        }
    }

    private static void dfs(int k, int n) {
        if (k == n) {
            print(n);
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (ack[k][i] == 0) {
                int[][] tmp = new int[n][n];
                copy(ack, tmp, n);

                que[k][i] = 'Q';
                updateAck(k, i, n);

                dfs(k + 1, n);

                copy(tmp, ack, n);
                que[k][i] = '.';
            }
        }
    }

    private static void copy(int[][] a, int[][] b, int n) {
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, b[i], 0, n);
        }
    }

    private static void updateAck(int x, int y, int n) {
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
        ack[x][y] = 1;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < 8; j++) {
                int nx = x + i * dx[j];
                int ny = y + i * dy[j];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    ack[nx][ny] = 1;
                }
            }
        }
    }

    private static void print(int n) {
        List<List<Integer>> positions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (que[i][j] == 'Q') {
                    row.add(j + 1);
                }
            }
            positions.add(row);
        }

        for (List<Integer> row : positions) {
            for (int i : row) {
                System.out.print(i + " ");
            }
//            System.out.println();
        }

        System.out.println();
    }
}