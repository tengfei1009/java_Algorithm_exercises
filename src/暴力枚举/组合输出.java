package 暴力枚举;

import java.util.Scanner;

public class 组合输出 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int r;
    static int[] arr;

    public static void main(String[] args) {
        n = sc.nextInt();
        r = sc.nextInt();
        arr = new int[r];
        dfs(0, 1);
    }

    private static void dfs(int stp, int flag) {
        if (stp == r) {
            printCombination();
            return;
        }
        //进行合理减枝
        if (n - flag + 1 < r - stp) {
            return;
        }
        for (int i = flag; i <= n; i++) {
            arr[stp] = i;//arr[2]=5
            dfs(stp + 1, i + 1);

        }
    }
    private static void printCombination() {
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}