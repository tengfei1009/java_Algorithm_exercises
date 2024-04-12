package 队列;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.io.*;
import java.util.*;

public class 单调队列_2 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        int n = nextInt(); // 输入的元素个数
        int k = nextInt(); // 滑动窗口的大小
        int[] num = new int[n]; // 存储输入的元素
        int[] max = new int[n - k + 1]; // 存储滑动窗口的最大值
        int[] min = new int[n - k + 1]; // 存储滑动窗口的最小值
        for (int i = 0; i < n; i++) {
            num[i] = nextInt(); // 读取输入的元素
        }

        // 求滑动窗口的最大值
        Deque<Integer> dq = new LinkedList<>(); // 使用双端队列实现单调队列

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && num[i] <= num[dq.peekLast()]) {
                dq.removeLast(); // 移除队列中比当前元素小的元素
            }
            dq.offerLast(i); // 将当前元素的索引加入队列

            while (dq.peekFirst() <= i - k) {
                dq.pollFirst(); // 移除队列中已经不在窗口范围内的元素
            }
            if (i >= k - 1) {
                out.print(num[dq.peekFirst()] + " "); // 输出当前窗口的最大值
            }
        }

        out.println();

        // 求滑动窗口的最小值
        dq = new LinkedList<>(); // 重置双端队列

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && num[i] >= num[dq.peekLast()]) {
                dq.pollLast(); // 移除队列中比当前元素大的元素，求最小值
            }
            dq.offerLast(i); // 将当前元素的索引加入队列

            while (dq.peekFirst() < i - k + 1) {
                dq.pollFirst(); // 移除队列中已经不在窗口范围内的元素
            }
            if (i >= k - 1) {
                out.print(num[dq.peekFirst()] + " "); // 输出当前窗口的最小值
            }
        }
        out.flush();
    }

    static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) in.nval;
    }
}