package 蓝桥杯;

import java.util.Scanner;

public class 冶炼金属 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//冶炼的记录
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt(); //普通金属的个数
            int B = sc.nextInt(); //特殊金属的个数
            min = Math.max(min,A/(B+1)+1);
            max = Math.min(max,A/B);
        }
        System.out.print(min + " " + max);
    }
}
