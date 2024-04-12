package 二叉树的遍历;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 完全二叉树的权值_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque qu = new LinkedList();
        int len = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        for (int i = 1; i < n; i++) {

        }
    }

}
