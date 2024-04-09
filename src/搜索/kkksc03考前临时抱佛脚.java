package 搜索;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;import java.util.*;


public class kkksc03考前临时抱佛脚 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int mid = Integer.parseInt(arr[i]);
            for (int j = 0; j < mid; j++) {
                //将获取到的科目存到一个集合中
                current.add(sc.nextInt());
            }
            res.add(new ArrayList<>(current));
            current.clear();
        }
        int sum = 0;
//        定义dp数组,表示复习一科需要的最短时间
        int m = res.size();
        //总共有m科
        int[][] dp = new int[m][];
        for (int i = 0; i < dp.length; i++) {
            int n = res.get(i).size();
            dp[i] = new int[n];

            if (n == 2) {
                sum += Math.max(res.get(i).get(0), res.get(i).get(1));
            } else if (n == 1) {
                sum += res.get(i).get(0);
            } else {
                dp[i][0] = res.get(i).get(0);
                dp[i][1] = Math.max(res.get(i).get(0), res.get(i).get(1));

                for (int j = 2; j < n; j++) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i][j - 2] + res.get(i).get(j));
                }
                sum += dp[i][n - 1];
            }
        }

        System.out.println(sum);

    }
}
