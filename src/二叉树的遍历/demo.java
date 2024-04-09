package 二叉树的遍历;

import java.util.Scanner;

public class demo {
    static int n; // 存储输入的值

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 读取输入的值，存储到变量n中
        dfs(0, 0); // 调用dfs函数开始深度优先搜索
    }

    // 深度优先搜索函数
    public static void dfs(int idx, int v) {
        if (idx == n) { // 已经遍历完所有位数
            for (int i = idx-1; i >=0; i--) {
                if (((v >> i) & 1) != 0) // 输出当前v的二进制表示中的第i位
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println(); // 换行
            return;
        }

        // 递归调用dfs函数，分别尝试两种情况
        // 一种是v不变，即dfs(idx + 1, v)
        dfs(idx + 1, v);
        // 另一种是将v加上(1 << (n - idx - 1))，即dfs(idx + 1, v + (1 << (n - idx - 1)))
        dfs(idx + 1, v + (1 << (n - idx - 1)));
    }
}