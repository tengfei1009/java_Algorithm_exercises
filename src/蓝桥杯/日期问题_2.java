package 蓝桥杯;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 日期问题_2 {
    static int[] month = {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("/");//分割成字符数组
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = Integer.valueOf(arr[i]);  //02——》2
        }
        List<String> list = new ArrayList<>();
        int y;//当前年份
        if (b[0] >= 60) {
            y = 1900 + b[0];
        } else {
            y = 2000 + b[0];
        }
//            System.out.println(y);
//        System.out.println(b[2]);

        check(y, arr[1], arr[2], list);
        if (b[2] >= 60) {
            y = 1900 + b[2];
        } else {
            y = 2000 + b[2];
        }
//            System.out.println(y);
        check(y, arr[0], arr[1], list);
        check(y, arr[1], arr[0], list);
        Collections.sort(list);
        for (String x : list) {
                System.out.println(x);
        }
    }

    public static void check(int y, String m, String d, List<String> list) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) { //每四年一润，每一百年不润，每四百年一润
            month[2] = 29;
        } else {
            month[2] = 28;
        }
        int M = Integer.valueOf(m);
        int D = Integer.valueOf(d);

        String str = y + "-" + m + "-" + d;
        if (M <= 12 && D <= month[M] && !list.contains(str) && D > 0) {
            list.add(str);
        }
    }
}
