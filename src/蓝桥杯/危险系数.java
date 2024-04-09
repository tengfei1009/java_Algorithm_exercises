package 蓝桥杯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 危险系数 {
    static int res;
    static int count;
    static ArrayList<Integer> result =new ArrayList<>();
    static int[] v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //站点数
        int m = sc.nextInt(); //通道数
        List<Integer>[] list = new List[n + 1];
        boolean[] check = new boolean[n + 1];
        //将所有路径都连起来
        for (int i = 0; i <= n; i++) {
            //初始化集合
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            //连接通路
            list[u].add(v);
            list[v].add(u);
        }
        v = new int[n + 1];
        int start = sc.nextInt();
        int end = sc.nextInt();
        dfs(start, end, start, list, check);
        for (int i = 1; i < v.length; i++) {
            if (i==start||i==end) continue;
            if (v[i] == count) {
                res++;
            }
        }
        System.out.println(res);
    }

    private static void dfs(int start, int end, int current, List<Integer>[] list, boolean[] check) {
        if (end == current) {
            ArrayList<Integer> arr =new ArrayList(result);
            for (int i = 0; i < arr.size(); i++) {
                v[arr.get(i)]++;
            }
            count++;
            return;
        }

        for (int x : list[current]) {
            if (!check[x]) {//没有走过
                check[x] = true;
                result.add(x);
                dfs(start, end, x, list, check);
                check[x] = false;
                result.remove(result.size()-1);
            }
        }
    }
}