package 蓝桥杯;

import java.util.Scanner;

public class 日期问题 {
    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean check_valid(int year, int month, int day) {
        if (month == 0 || month > 12) {
            return false;
        }
        if (day == 0 || month != 2 && day > days[month]) {
            return false;
        }
        if (month == 2) {
            int leap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0;
            if (day > days[2] + leap) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("/");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

//        System.out.println(a + " " + b + " " + c);
        for (int i = 19600101; i <= 20591231; i++) {
            int year = i / 10000;
            int month = i / 100 % 100;
            int day = i % 100;
//            System.out.println(year);
            if (check_valid(year, month, day)) {
                if (year % 100 == a && month == b && day == c || month == a && day == b && year % 100 == c || day == a && month == b && year % 100 == c) {
                    System.out.printf("%d-%02d-%02d", year, month, day);
                    System.out.println();
                }
            }
        }
    }
}