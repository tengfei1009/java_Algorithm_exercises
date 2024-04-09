package 队列;

import java.util.Deque;
import java.util.LinkedList;

public class 有效的括号 {
    public boolean isValid(String s) {
        //栈，栈操作有 push、pop、peek
        Deque <Character>qu = new LinkedList();
        //剪枝优化
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                qu.push(')');
            } else if (c == '{') {
                qu.push('}');
            } else if (c == '[') {
                qu.push(']');
                //判断当前元素,是否和栈顶元素一样
            } else if (qu.isEmpty() || qu.peek() != c) {
                return false;
            }else {
                //匹配了,就消除
                qu.pop();
            }
        }
        //不为空就返回false,说明左括号多了,反之全部匹配,返回true
        return qu.isEmpty();
    }
}
