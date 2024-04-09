package 队列;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class 单调队列_2 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        int n = nextInt();
        int k = nextInt();
        int[] num = new int[n];
        int[] max = new int[n - k + 1];//移动的次数,也就是滑动窗口的最大值
        int[] min = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            num[i] = nextInt();
        }
        //求最大值
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && num[i] <= num[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.offerLast(i);

            while (dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            if (i >= k - 1) {
                out.print(num[dq.peekFirst()] + " ");
            }
        }

        out.println();
        dq = new LinkedList<>();
        //首先将k个数放入优先队列中
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && num[i] >= num[dq.peekLast()]) { //求最大值
                dq.pollLast(); //当前添加大于,就移除前面小的
            }
            dq.offerLast(i);
            while (dq.peekFirst() < i - k + 1) {
                dq.peekFirst();
            }
            if (i >= k - 1) {
                out.print(num[dq.peekFirst()] + " ");
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
