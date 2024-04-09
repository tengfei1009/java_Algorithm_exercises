package 力扣数组.简单;

import java.util.ArrayList;
import java.util.Map;

public class _821字符的最短距离 {
    public int[] shortestToChar(String s, char c) {
        char[] ch = s.toCharArray();
        int[] arr = new int[s.length()];
        int lst = -1;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                lst = i;
            }
            if (lst != -1) {
                arr[i] = i - lst;
            } else {
                arr[i] = Integer.MAX_VALUE; // 设置为最大值表示无效距离
            }
        }

        lst = s.length();
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == c) {
                lst = i;
            }
            if (lst != s.length()) {
                arr[i] = Math.min(arr[i], lst - i);
            }
        }

        return arr;
    }
}


