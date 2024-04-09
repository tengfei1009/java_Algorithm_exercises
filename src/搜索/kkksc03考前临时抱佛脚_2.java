package 搜索;

import java.util.Scanner;

public class kkksc03考前临时抱佛脚_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numQuestions = new int[4]; // 每科题目数量
        int[][] time = new int[4][]; // 每道题目所需时间

        for (int i = 0; i < 4; i++) {
            numQuestions[i] = sc.nextInt();
            time[i] = new int[numQuestions[i]];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < numQuestions[i]; j++) {
                time[i][j] = sc.nextInt();
                System.out.println(time[i][j]);

            }
        }

        int[][] dp = new int[4][];
        for (int i = 0; i < 4; i++) {
            dp[i] = new int[numQuestions[i]];

            if (numQuestions[i] == 1) {
                dp[i][0] = time[i][0];
            } else if (numQuestions[i] >= 2) {
                dp[i][0] = time[i][0];
                dp[i][1] = Math.max(time[i][0], time[i][1]);

                for (int j = 2; j < numQuestions[i]; j++) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i][j - 2] + time[i][j]);
                }
            }
        }

        int totalTime = 0;
        for (int i = 0; i < 4; i++) {
            totalTime += dp[i][numQuestions[i] - 1];
        }
        System.out.println(totalTime);
    }
}