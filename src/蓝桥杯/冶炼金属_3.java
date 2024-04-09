package 蓝桥杯;

import java.util.Scanner;

public class 冶炼金属_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//多少条记录
        int[][] f = new int[n][2];
        for (int i = 0; i < n; i++) {
            f[i][0] = sc.nextInt(); //普通金属
            f[i][1] = sc.nextInt(); //特殊金属
        }
        long l = 0, r = Integer.MAX_VALUE;
        long min;
        while (l < r) {
            long mid = l + r >> 1;
            if (check1(f, mid)) r = mid;
            else l = mid + 1;
        }
        min =l;
        l=0;r= Integer.MAX_VALUE;
        while (l < r) {
            long mid = l + r +1>> 1;
            if (check2(f, mid)) l = mid;
            else r = mid - 1;
        }
        System.out.println(min+" "+l);
    }

    public static boolean check1(int[][] f, long mid) {
        for (int[] x : f) {
            long c = x[0]/mid;
            if(c>x[1])return false;  //v值小了
        }
        return true;
    }

    public static boolean check2(int[][] f, long mid) {
        for (int[] x : f) {
            long c = x[0]/mid;
            if(c<x[1])return false;  //v值小了
        }
        return true;
    }
}
