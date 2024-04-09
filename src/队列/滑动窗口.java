package 队列;

import java.util.Deque;
import java.util.LinkedList;

public class 滑动窗口 {

}

class Solution1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>(); // 双端队列用于存储窗口中的元素索引
        int[] res = new int[nums.length - k + 1]; // 存储每个窗口的最大值结果

        // 未形成窗口时的初始化
        for (int i = 0; i < k; i++) {
            // 维护队列单调递减，移除比当前元素小的元素，确保队列首元素为当前窗口的最大值
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]); // 将当前元素索引添加到队列尾部
        }
        res[0] = deque.peekFirst(); // 第一个窗口的最大值即为队列首元素

        // 形成了窗口后的滑动过程
        for (int i = k; i < nums.length; i++) {
            // 如果队列首元素是窗口最左边的元素，说明该元素已不在窗口内，移除
            if (nums[i - k] == deque.peekFirst()) {
                deque.removeFirst();
            }
            // 维护队列单调递减，移除比当前元素小的元素，确保队列首元素为当前窗口的最大值
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]); // 将当前元素索引添加到队列尾部
            res[i - k + 1] = deque.peekFirst(); // 存储当前窗口的最大值
        }
        return res;
    }
}
