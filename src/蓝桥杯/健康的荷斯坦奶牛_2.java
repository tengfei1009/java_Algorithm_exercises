package 蓝桥杯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 健康的荷斯坦奶牛_2 {
    static int[] min;
    static int[] res;
    static List<Integer> array = new ArrayList<>();
    static List<Integer> result = new ArrayList<>();
    static List<Integer>[] p = new ArrayList[16];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); //维他命的种类数
        min = new int[v + 1];
        //每种维他命最小的需求量
        for (int i = 1; i <= v; i++) { // 修正：循环条件应为 i <= v
            min[i] = sc.nextInt();
        }
        //用来喂牛的饲料种数
        int g = sc.nextInt();
        //每种饲料包含的维他命的量是多少
        int[][] arr = new int[g + 1][v + 1];
        for (int i = 1; i <= g; i++) { // 修正：循环条件应为 i <= g
            for (int j = 1; j <= v; j++) { // 修正：循环条件应为 j <= v
                arr[i][j] = sc.nextInt();
            }
        }
        res = new int[v + 1];
        dfs(arr, res, 1);
        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            List<Integer> mid = p[array.get(i)];
            for (int j = 0; j < mid.size(); j++) {
                System.out.print(mid.get(j) + " ");
            }
            System.out.println();
        }
    }

    //搜出所有满足条件的种数
    private static void dfs(int[][] arr, int[] sum, int step) {
        boolean a = true;
        for (int i = 1; i < min.length; i++) {
            if (sum[i] < min[i]) {
                a = false;
                break;
            }
        }

        if (!a) {
            for (int i = step; i < min.length; i++) {
                boolean c = false;
                for (int j = 1; j < sum.length; j++) { // 修正：循环条件应为 j < sum.length
                    if (sum[j] < min[j]) { // 循环变量应为 j，而不是 i
                        sum[j] += arr[i][j]; // 数组索引应为 [i][j]，而不是 [step][i]
                        result.add(j); // 添加的是 j，而不是 i
                        c = true;
                    }
                }
                if (c) {
                    dfs(arr, sum, i + 1); // 修正：递归调用时传入 i+1，而不是 step+1
                    for (int j = 1; j < sum.length; j++) { // 修正：循环条件应为 j < sum.length
                        sum[j] -= arr[i][j]; // 修正：数组索引应为 [i][j]，而不是 [step][i]
                    }
                }
            }
        } else {  //所有的都大了,就记录当前饲料种数
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) == step) {
                    return;
                }
            }
            array.add(step);
            List<Integer> mid = new ArrayList<>();
            p[step] = mid; // 将 mid 赋值给 p[step]
        }
    }
}
