package 蓝桥杯;

import java.util.Scanner;

public class 翻硬币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial = sc.nextLine();
        String target = sc.nextLine();

        int minFlips = getMinFlips(initial, target);
        System.out.println(minFlips);
    }

    private static int getMinFlips(String initial, String target) {
        int count = 0;
        int n = initial.length();

        for (int i = 0; i < n - 1; i++) {
            if (initial.charAt(i) != target.charAt(i)) {
                // 翻转当前位置和下一个位置的硬币
                initial = flip(initial, i);
                count++;
            }
        }

        return count;
    }

    private static String flip(String str, int index) {
        char[] arr = str.toCharArray();
        arr[index] = arr[index] == '*' ? 'o' : '*';
        arr[index + 1] = arr[index + 1] == '*' ? 'o' : '*';
        return new String(arr);
    }
}
