package 蓝桥杯;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 错误票据_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 消耗第一行的换行符
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                array.add(Integer.parseInt(arr[j]));
            }
        }
        Collections.sort(array);

        int a = 0;
        int b = 0;
        boolean check = false;
        int start = 0;

        for (int i = array.get(0); i < array.get(array.size() - 1); i++) {
            if (array.get(start) != i && !check) {
                a = i;
                check = true;
            }
            if (start < array.size()) {
                start++;
            }
            if (start > 0 && array.get(start) == array.get(start - 1)) {
                b = array.get(start);
            }
            if (a * b != 0) {
                break;
            }
        }
        System.out.println(a + " " + b);
    }
}