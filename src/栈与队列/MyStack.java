package 栈与队列;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1; // 主队列，用于存储栈中的元素
    Queue<Integer> queue2; // 辅助队列，用于辅助操作

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x); // 先将元素放入辅助队列

        // 将主队列中的元素全部转移到辅助队列中，保证新加入的元素位于队列头部
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // 交换主队列和辅助队列的引用，使得主队列始终为空队列
        Queue<Integer> queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp;
    }

    public int pop() {
        return queue1.poll(); // 弹出主队列的头部元素，即为栈顶元素
    }

    public int top() {
        return queue1.peek(); // 获取主队列的头部元素，即为栈顶元素，但不移除
    }

    public boolean empty() {
        return queue1.isEmpty(); // 判断主队列是否为空，即判断栈是否为空
    }
}
