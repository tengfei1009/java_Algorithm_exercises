package 队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 最长有效括号_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n = sc.next();
        System.out.println(longestValidParentheses(n));
    }
    public static int longestValidParentheses(String s) {
        int n = s.length();
        Deque<Integer> qu = new LinkedList<>();
        qu.offer(-1);
        int res =0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                qu.offer(i); //存入当前索引
            } else {
                if (qu.peekLast() != -1 && s.charAt(qu.peekLast())=='(') {
                    int index = qu.pollLast();
                    res =Math.max(res,i-qu.peekLast());
                }else {
                    qu.addLast(i);
                }
            }
        }
        return res;
    }
}
