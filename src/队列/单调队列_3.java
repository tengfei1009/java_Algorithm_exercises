package 队列;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class 单调队列_3 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        int n = nextInt();
        int k = nextInt();
        int[] num = new int[n];
        Deque<Integer> min = new LinkedList();
        Deque<Integer> max = new LinkedList();
        for (int i = 0; i < n; i++) {
            num[i] = nextInt();
        }
        for (int i = 0; i < n; i++) {
            //最小值
            while (!min.isEmpty() && num[i] <= num[min.peekLast()]) {
                min.removeLast();
            }
            min.offerLast(i);

            //判断最小值是否在双端队列中
            if (min.peekFirst() <= i - k) {
                min.pollFirst();
            }
            if (i >= k - 1) {
                out.print(num[min.peekFirst()] + " ");
            }
        }
        out.println();
        for (int i = 0; i < n; i++) {
            //最大值
            while (!max.isEmpty() && num[i] >= num[max.peekLast()]) {
                max.removeLast();
            }
            max.offerLast(i);

            //判断最大值是否在双端队列中
            if (max.peekFirst() <= i - k) {
                max.pollFirst();
            }
            if (i >= k - 1) {//当大于等于队列的长度的时候,每增加一个数就出现一个最大值
                out.print(num[max.peekFirst()] + " ");
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