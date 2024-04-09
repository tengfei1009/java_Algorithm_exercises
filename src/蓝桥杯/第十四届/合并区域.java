package 蓝桥杯.第十四届;

import java.util.Scanner;
public class 合并区域 {
// 1:无需package
// 2: 类名必须Main, 不可修改

    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n * 2;
        int[][] arr = new int[h][n];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    dfs(arr, i, j);//判断当前坐标
                    max = count > max ? count : max;
                    count = 0;
                }
            }
        }
        max = (h - max) > max ? (h - max) : max;
        System.out.println(max);
        sc.close();
    }

    private static void dfs(int[][] arr, int x, int y) {
        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || arr[x][y] == 0) {
            return;
        }
        arr[x][y] = 0;
        count++;
        //朝四个方向遍历
        dfs(arr, x - 1, y);
        dfs(arr, x + 1, y);
        dfs(arr, x, y + 1);
        dfs(arr, x, y - 1);
    }
}
