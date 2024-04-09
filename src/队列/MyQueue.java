package 队列;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    //双端队列
    Deque<Integer> deque = new LinkedList<>();

    //弹出元素时,比较当前要弹出的数值是否等于队列出口的数值.如果相等就弹出
    //同时判断队列是否为空
    //弹出
    void poll(int val) {
        if (!deque.isEmpty() && val == deque.peek()) {
            deque.poll(); //移除并返回队列头部的元素,如果队列为空则返回null
        }
    }

    //添加元素,添加元素大于入口处元素,弹出入口元素
    //保证队列元素单调递减
    void add(int val) {
        while (!deque.isEmpty() && val > deque.getLast()) {
            deque.removeLast();
        }
        deque.add(val);
    }

    //队列对顶元素始终为最大值
    int peek() {
        return deque.peek();
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        int len = nums.length - k + 1;
        //存放结果的数组
        int[] res = new int[len];
        int num = 0;
        //自定义队列
        MyQueue myQueue = new MyQueue();
        //先将前k的元素放入队列
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        res[num++] = myQueue.peek(); //将第一次结果存储
        for (int i = k; i < nums.length; i++) {//从第二次开始
            //滑动窗口移除最前面的元素,移除是判断该元素是否放入队列
            myQueue.poll(nums[i - k]); //移除栈顶元素
            //滑动窗口加入最后面的元素
            myQueue.add(nums[i]);
            res[num++] = myQueue.peek();  //获取移动窗口后的最大值
        }
        return res;
    }
}
