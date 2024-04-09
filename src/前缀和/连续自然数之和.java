package 前缀和;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 连续自然数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//给定一个正整数
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < m; i++) {
            for (int j = i; j < m; j++) {
                sum += j;
                if (sum == m) {
                    System.out.println(i + " " + j);
                    break;
                }
                if (sum > m) {
                    break;
                }
            }
            sum = 0;
        }
    }

}
