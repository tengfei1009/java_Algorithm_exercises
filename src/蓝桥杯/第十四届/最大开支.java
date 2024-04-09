package 蓝桥杯.第十四届;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 最大开支 {
    static List<ArrayList<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //参加活动的人数
        int m = sc.nextInt(); //参加娱乐项目的个数

        int[] k = new int[m];
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            k[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        backTracking(0, m, n, 0, new ArrayList<>());

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < res.size(); i++) {
            int sum = 0;
            for (int j = 0; j < res.get(i).size(); j++) {
                int person = res.get(i).get(j);
                sum += (person * k[j] + b[j]) * person;
            }
            max = sum > max ? sum : max;
        }
        System.out.println(max);
        sc.close();
    }

    private static void backTracking(int step, int m, int n, int sum, ArrayList<Integer> current) {
        if (step == m) {
            if (sum <= n) {
                ArrayList<Integer> mid = new ArrayList<>(current) ;
                res.add(mid);
            }
            return;
        }
        for (int i = 0; i <= n; i++) {
            current.add(i);
            sum += i;
            backTracking(step + 1, m, n, sum, current);
            current.remove(current.size() - 1);
            sum -= i;
        }
    }
}