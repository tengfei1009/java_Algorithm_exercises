package 队列;

import java.util.Arrays;
import java.util.Scanner;

public class 水往地低处流_2 {
    public static int[][] pos = new int[2001][2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] hs = new int[n + 1][n + 1];
        TianDi[] tianDis = new TianDi[n * n];

        int count = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                hs[i][j] = sc.nextInt();
                tianDis[count] = new TianDi(i, j, hs[i][j]);
                count++;
            }
        }

        //排序
        Arrays.sort(tianDis, (o1, o2) -> o2.h - o1.h);

        int ans = 0;

        for (int i = 0; i < count; i++) {
            if (pos[tianDis[i].x][tianDis[i].y] == 1) continue;
            ans++;
            dfs(hs, tianDis[i].x, tianDis[i].y, tianDis[i].h);
        }
        System.out.println(ans);

    }

    public static void dfs(int[][] hs, int x, int y, int h) {
        pos[x][y] = 1;
        if (x + 1 <= hs.length - 1 && h > hs[x + 1][y] && pos[x + 1][y] == 0) dfs(hs, x + 1, y, hs[x + 1][y]);
        if (x - 1 >= 1 && h > hs[x - 1][y] && pos[x - 1][y] == 0) dfs(hs, x - 1, y, hs[x - 1][y]);
        if (y + 1 <= hs.length - 1 && h > hs[x][y + 1] && pos[x][y + 1] == 0) dfs(hs, x, y + 1, hs[x][y + 1]);
        if (y - 1 >= 1 && h > hs[x][y - 1] && pos[x][y - 1] == 0) dfs(hs, x, y - 1, hs[x][y - 1]);
    }
}

class TianDi {
    int x;
    int y;
    int h;

    public TianDi(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }
}

