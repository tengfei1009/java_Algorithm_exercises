package 队列;

import java.util.Deque;
import java.util.LinkedList;

public class 最长有效括号_4 {
    public int longestValidParentheses(String s) {
        int maxlength = 0;
        //使用队列模拟一个栈
        Deque<Integer> qu = new LinkedList<>();
        //初始化值
        qu.push(-1);
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                //将当前有效索引压入栈
                qu.push(i);
            } else {
                qu.pop();
                if (qu.isEmpty()) {
                    qu.push(i);
                } else {
                    //配对成功,将前一个出栈,算出当前最大长度
                    length = i-qu.peek();
                    maxlength = length > maxlength ? length : maxlength;
                }
            }
        }
        return maxlength;
    }
}
