package 蓝桥杯;

import java.util.ArrayList;
import java.util.Scanner;

public class 拼接平方数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (check(i)) {
                array.add(i);
            }
        }
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }
        dfs(array, "", 0, 0, r, l);
    }

    private static boolean check(int x) {
        return (int) Math.sqrt(x) == Math.sqrt(x);
    }

    public static void dfs(ArrayList<Integer> array, String a, int step, int startIndex, int r, int l) {
        if (step == 2) {
            return;
        }
        int res = -1;
        if (!a.isEmpty()) {
            res = Integer.parseInt(a);
        }
        if (res > l && res < r && check(res)) {
            System.out.println(res);
            return;
        }
        for (int i = startIndex; i < array.size(); i++) {
            int length = a.length();
            a += array.get(i);
//            System.out.println(a);
            dfs(array, a, step + 1, i + 1, r, l);
            a = a.substring(0,length);
        }
    }
}