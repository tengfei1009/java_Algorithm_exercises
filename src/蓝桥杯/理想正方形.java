package 蓝桥杯;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//单调队列
public class 理想正方形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[a][b];
        int[] min = new int[arr.length - n + 1]; //滑动多少次  首项减尾项加一,两端长度相减+1得到点数
        int[] max = new int[arr.length - n + 1];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            deque.clear();
            for (int j = 0; j < b; j++) {
                while (!deque.isEmpty() && j - deque.getFirst() + 1 > n) {
                    deque.pollFirst();
                }
                while (!deque.isEmpty() && arr[i][deque.peekLast()] <= arr[i][j]) {
                    deque.pollLast();
                }
                //让j入队
                deque.offer(j);
                //记录区间的最值
                //max[i][j]表示第i行以j为末尾的区间最大值
            }
        }
    }
}
