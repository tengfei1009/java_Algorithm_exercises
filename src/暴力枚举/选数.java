package 暴力枚举;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 选数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList();
        Set<Integer> zong = new HashSet<>();
        //一共有多少个数
        int n = sc.nextInt();
        //一共划分多少次
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array.add(num);
        }
        int count = 0;
        result(array, k, 0, 0, zong);
        for (Integer integer : zong) {
            if (is(integer)) {
                count++;
            }
        }
        System.out.println(count);
    }

    //使用递归得到所有结果
    public static void result(ArrayList<Integer> nums, int k, int start, int sum, Set<Integer> sums) {
        if (k == 0) {
            sums.add(sum);
            return;
        }

        for (int i = start; i < nums.size(); i++) {
            result(nums, k - 1, i + 1, sum + nums.get(i), sums);
        }
    }

    public static boolean is(int num) {
        boolean s = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                s = false;
                break;
            }
        }
        return s;
    }
}