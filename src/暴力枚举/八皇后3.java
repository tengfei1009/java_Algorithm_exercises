package 暴力枚举;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 八皇后3 {
    static Scanner sc = new Scanner(System.in);
    // 棋盘大小
    static int n = sc.nextInt();
    // queen存储皇后的位置
    static int[][] queen = new int[n][n];
    // 标记皇后攻击的位置
    static int[][] attack = new int[n][n];
    // solve存储N皇后的全部解法
    // 存储多少种解法
    private static List<List<Integer>> result = new ArrayList<>();
    static int count;

    // 定义八个方向的方向数组
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        dfs(0);

        for (List<Integer> solution : result) {
            for (Integer value : solution) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }

    private static void dfs(int step) {
        if (step == n) {
            count++;
            if (count <= 3) {
                List<Integer> solution = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (queen[i][j] == 1) {
                            //记录当前所在列
                            solution.add(j+1);
                            break;
                        }
                    }
                }
                result.add(solution);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            // 判断当前第step行第i列是否可以放置皇后
            if (attack[step][i] == 0) {
                int[][] temp = new int[n][n];// 备份一下attack，标记不能放置的地方
                //
                for (int i1 = 0; i1 < n; i1++) {
                    for (int i2 = 0; i2 < n; i2++) {
                       temp[i1][i2]= attack[i1][i2];
                    }
                }
                // 当前位置没有皇后，放置皇后
                queen[step][i] = 1;
                // 更新attack数组
                put_queen(step, i, attack);
                dfs(step + 1);
                // 恢复attack数组
              //  attack = temp;
                for (int i1 = 0; i1 < n; i1++) {
                    for (int i2 = 0; i2 < n; i2++) {
                        attack[i1][i2]=temp[i1][i2];
                    }
                }
                // 当前位置放置皇后的结果出来后，归位
                queen[step][i] = 0;
            }
        }
    }

    // Valid(有效)
    // 行和列
    private static void put_queen(int row, int col, int[][] arr) {
        int nx = 0;
        int ny = 0;
        for (int i = 1; i < arr.length; i++) {  // 从皇后位置向1到n-1个距离延伸
            for (int j = 0; j <dx.length; j++) { // 遍历八个方向
                // 向每个方向延伸，最多八个位置
                nx = row + (i * dx[j]); // 生成的新位置的x
                ny = col + (i * dy[j]); // 生成的新位置的y

                // 新位置在棋盘范围内，将新位置标记为1
                if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length) {
                    arr[nx][ny] = 1;
                }
            }
        }
    }
}