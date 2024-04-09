package 组内练习;

import java.util.ArrayList;
import java.util.Scanner;

public class 求和 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        backTracking(arr, 0, 0);
        System.out.println(count);
    }

    static ArrayList<Integer> array = new ArrayList<>();

    private static void backTracking(int[] arr, int step, int startIndex) {
        if (step == 2) {
            ArrayList<Integer> res = new ArrayList<>(array);
//                System.out.print(res.get(0) + " " + res.get(1));
//                System.out.println();
            count += res.get(0) * res.get(1);
            return;
        }
        int prevSize = array.size(); // 记录之前的数组长度
        for (int i = startIndex; i < arr.length; i++) {
            array.add(arr[i]);
            step++;
            backTracking(arr, step, i + 1);
            step--;
            array.remove(array.size() - 1);
        }
        array.subList(prevSize, array.size()).clear(); // 将数组长度重置为之前记录的长度
    }
}