package 暴力枚举;

import java.util.Scanner;

public class 选数4 {
    static int n; // 数组中整数的个数
    static int k; // 选择的整数个数
    static int[] s; // 存储整数的数组
    static int ans; // 和为素数的结果数量

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        dfs(0, k, 0); // 进行深度优先搜索
        System.out.println(ans); // 输出结果数量
    }

    // 判断一个数是否为素数
    private static boolean is(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 深度优先搜索
    private static void dfs(int flag, int num, int sum) {
        if (num == 0) { // 已选择了k个整数
            if (is(sum)) { // 判断和是否为素数
                ans++; // 增加结果数量
            }
            return;
        }
        if (n - flag + 1 < num) {
            return;
        }
        for (int i = flag; i < n; i++) {
            dfs(i + 1, num - 1, sum + s[i]); // 选择下一个整数，并递归搜索
        }
        return;
    }
}

