package 蓝桥杯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 网络寻路_3 {
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] lists = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            lists[x].add(y);
            lists[y].add(x);
        }
        //标记数组
        int[] v = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(v, 0);
            v[i] = 1;
            dfs(i, i, lists, 0, v);
        }
        System.out.println(res);
    }

    public static void dfs(int s, int i, List<Integer>[] lists, int sum, int[] v) {
        if (sum == 3) {
            res++;
            return;
        }
        for (int x : lists[i]) {
            if (v[x] == 1) {
                if (sum == 2 && x == s) {//起点等于终点
                    dfs(s, x, lists, sum + 1, v);
                }
            } else {
                v[x] = 1;
                dfs(s, x, lists, sum + 1, v);
                v[x] = 0;
            }
        }
    }
}
