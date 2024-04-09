package 入门五;

import java.util.Scanner;

public class 语句解析_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        String str = sc.next();
        int temp, a, b, c;
        for (int i = 0; i < str.length(); i++) {
            if (i % 5 == 0) {
                temp = str.charAt(i);
                if (str.charAt(i + 3) >= 'a') {
                    arr[temp - 'a'] = arr[str.charAt(i + 3) - 'a'];
                } else {
                    arr[temp - 'a'] = str.charAt(i + 3) - '0';
                }
            }
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}