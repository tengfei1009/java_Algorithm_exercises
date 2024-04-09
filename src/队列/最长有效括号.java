package 队列;

import java.util.Deque;
import java.util.LinkedList;

public class 最长有效括号 {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack =new LinkedList<>();
        stack.addLast(-1);
        int n =s.length(),res=0;
        for (int i = 0; i < n; i++) {
            char c =s.charAt(i);
            if(c =='('){
                stack.addLast(i);
            }else {
                if(stack.peekLast()!=-1&&s.charAt(stack.peekLast()) =='('){
                    int index = stack.pollLast();
                    res =Math.max(res,i-stack.peekLast());
                }else {
                    stack.addLast(i);
                }
            }
        }
        return res;
    }
}
