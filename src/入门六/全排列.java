package 入门六;

import java.util.Scanner;

public class 全排列 {
    static int[] res = new int[10];  // 用于存储排列结果的数组
    static boolean[] pos = new boolean[10];  // 用于标记数字是否已经被使用的数组

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 读取输入的整数 n，表示要生成全排列的数字范围
        dfs(1, n);  // 调用深度优先搜索函数，从第一个位置开始生成排列
        sc.close();
    }

    public static void dfs(int step, int n) {
        if (step > n) {  // 如果已经生成了完整的排列，即遍历到最后一个位置
            for (int i = 1; i <= n; i++) {
                System.out.printf("%5d", res[i]);  // 输出当前排列
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {  // 尝试将每个数字填入当前位置
            if (!pos[i]) {  // 如果数字 i 还未被使用
                res[step] = i;  // 将数字 i 填入当前位置
                pos[i] = true;  // 标记数字 i 已被使用
                dfs(step + 1, n);  // 递归调用，填入下一个位置
                pos[i] = false;  // 恢复数字 i 的可用状态，以便尝试其他数字
            }
        }
    }
}