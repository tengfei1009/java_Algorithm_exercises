package 搜索;

import java.util.Scanner;

public class 细胞 {
    static int n;
    static int m;
    static int ans;
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            arr[i] = str.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != '0') {
                    ans++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m || arr[x][y] == '0') {
            return;
        }

        //表示已经访问过了
        arr[x][y] ='0';

        dfs(x - 1, y); // 搜索上
        dfs(x + 1, y); // 搜索下
        dfs(x, y - 1); // 搜索左
        dfs(x, y + 1); // 搜索右
    }
}