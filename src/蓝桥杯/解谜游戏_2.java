package 蓝桥杯;

import java.util.Scanner;

public class 解谜游戏_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String wai, zhong, nei;
        for (int i = 0; i < n; i++) {
            wai = sc.next();
            zhong = sc.next();
            nei = sc.next();
            boolean flag = check(wai,zhong,nei);

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean check(String wai, String zhong, String nei) {
        for (int i = 0; i < 4; i++) {
            int green = 0;
            int red = 0;
            int yellow = 0;
            int[] arr = new int[6];
            arr[0] = nei.charAt(i);
            arr[1] = zhong.charAt(i);
            arr[2] = zhong.charAt(i + 4);
            arr[3] = wai.charAt(i);
            arr[4] = wai.charAt(i + 4);
            arr[5] = wai.charAt(i + 8);

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'G') {
                    green++;
                }
                if (arr[j] == 'R') {
                    red++;
                }
                if (arr[j] == 'Y') {
                    yellow++;
                }
            }
            if (green != 3 || red != 2 || yellow != 1) {
                return false;
            }
        }
        return true;
    }
}
