package 栈与队列;

import java.util.Stack;
import java.util.Queue;

//queue: 队,行列
public class MyQueue {

    Stack<Integer> stackIn; // 用于进栈的Stack
    Stack<Integer> stackOut; // 用于出栈的Stack

    public MyQueue() {
        stackIn = new Stack<>(); // 初始化进栈Stack
        stackOut = new Stack<>(); // 初始化出栈Stack
    }

    // 压栈操作，将元素x压入进栈Stack
    public void push(int x) {
        stackIn.push(x);
    }

    // 出栈操作，将队列的第一个元素弹出并返回
    public int pop() {
        dumpStackIn(); // 将进栈Stack中的元素转移到出栈Stack中
        return stackOut.pop(); // 弹出出栈Stack的栈顶元素
    }

    // 查看队列的第一个元素，但不进行弹出
    public int peek() {
        dumpStackIn(); // 将进栈Stack中的元素转移到出栈Stack中
        return stackOut.peek(); // 返回出栈Stack的栈顶元素
    }

    // 判断队列是否为空
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty(); // 当进栈Stack和出栈Stack都为空时，队列为空
    }

    // 如果出栈Stack为空，将进栈Stack中的元素转移到出栈Stack中
    private void dumpStackIn() {
        if (!stackOut.isEmpty()) {
            return; // 如果出栈Stack不为空，不需要转移元素
        }

//        abcde    edcba       再出去就是abcde,也就是队列
        while (!stackIn.isEmpty()) {
            // 将进栈Stack中的元素一个个弹出，并压入出栈Stack中，实现元素的顺序转换
            stackOut.push(stackIn.pop());
        }
    }
}
