package 暴力枚举;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class 八皇后2 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[][] queen = new int[n][n];
    private static List<List<Integer>> result = new ArrayList<>();
    static int count;

    public static void main(String[] args) {
        dfs(0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);

        for (List<Integer> solution : result) {
            for (Integer value : solution) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }

    private static void dfs(int row, boolean[] cols, boolean[] diagonals1, boolean[] diagonals2) {
        if (row == n) {
            count++;
            if (count <= 3) {
                List<Integer> solution = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (queen[i][j] == 1) {
                            solution.add(j + 1);
                            break;
                        }
                    }
                }
                result.add(solution);
            }
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!cols[col] && !diagonals1[row + col] && !diagonals2[row - col + n - 1]) {
                queen[row][col] = 1;
                cols[col] = true;
                diagonals1[row + col] = true;
                diagonals2[row - col + n - 1] = true;
                dfs(row + 1, cols, diagonals1, diagonals2);
                queen[row][col] = 0;
                cols[col] = false;
                diagonals1[row + col] = false;
                diagonals2[row - col + n - 1] = false;
            }
        }
    }
}
