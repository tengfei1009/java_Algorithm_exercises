package 暴力枚举;

import java.util.ArrayList;
import java.util.List;

//深度搜索
public class 三连击2 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 可选的数字
        int[] ratio = new int[3]; // 比例数组，分别对应A、B、C的比例
        List<List<Integer>> result = new ArrayList<>(); // 存储结果的列表

        dfs(digits, ratio, result);

        if (result.isEmpty()) {
            System.out.println("No!!!");
        } else {
            for (List<Integer> combination : result) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(combination.get(i));
                    if (i < 2) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    private static void dfs(int[] digits, int[] ratio, List<List<Integer>> result) {
        if (ratio[2] != 0 && (ratio[0] * ratio[1] * ratio[2] == 1)) {
            List<Integer> combination = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                combination.add(ratio[i]);
            }
            result.add(combination);
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (ratio[0] * digits[i] % ratio[1] == 0) {
                ratio[2] = ratio[0] * digits[i] / ratio[1];
                if (ratio[2] <= 9 && ratio[2] != ratio[0] && ratio[2] != ratio[1]) {
                    ratio[0] = digits[i];
                    dfs(digits, ratio, result);
                    ratio[0] = 0;
                    ratio[2] = 0;
                }
            }
        }
    }
}
