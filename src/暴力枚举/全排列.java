package 暴力枚举;

import java.util.Scanner;

public class 全排列 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] res;
    static boolean[] pos;

    public static void main(String[] args) {
        n = sc.nextInt();
        res = new int[n];
        pos = new boolean[n + 1];
        dfs(0);
    }

    public static void dfs(int step) {
        if (step == n) {
            for (int i = 0; i < res.length; i++) {
                System.out.printf("%5d", res[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!pos[i]) {
                res[step] = i;
                pos[i] = true;
                dfs(step + 1);  //4 5 最后五号位结束,把五号位标记取消,到四号位,四号位++到第五个数,此时四号位等于被重置的第五个数  从四号位再进入五号位,五号位此时遍历数组,等于四号位的数
                //4 5 结束了,从五号位返回四号位,因为四号位等于最后一个数,所以从四号位返回三号位,三号位取消标记并且++,三号位等于第四个数,此时进入四号位,四号位从前往后遍历,等于第三个数,进入五号位,五号位就等于第五个数,然后再回溯到三号位取消三号位的标记并移动到三号位的下一位
                //也就是说总体上看,每个位置有多少种选择,五个数,一号位五种选择,二号位五种选择,三号位五种选择,四号位五种选择,五号位五种选择
                pos[i] = false;
            }
        }
    }
}