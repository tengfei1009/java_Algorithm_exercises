package 队列;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 单调队列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();  // 定义窗口
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] min = new int[nums.length - k + 1]; //滑动多少次  首项减尾项加一,两端长度相减+1得到点数
        int[] max = new int[nums.length - k + 1];

        // 未形成窗口
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        // 形成窗口后
        for (int i = k; i < n; i++) {
            min[i - k] = nums[deque.peekFirst()];//使用i-k记录当前窗口的最小值
            while (!deque.isEmpty() && deque.peekFirst() < i - k+1) {//当前最小值不在窗口内了
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        min[nums.length - k] = nums[deque.peekFirst()];

        // 输出结果
        for (int i = 0; i < min.length; i++) {
            System.out.print(min[i] + " "+max[i]);
        }
    }
}