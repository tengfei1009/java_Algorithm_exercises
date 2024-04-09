package 双指针;

public class 比较含退格的字符串 {
        public boolean backspaceCompare(String s, String t) {
            int p1 = s.length() - 1; // 指向字符串 s 的末尾
            int p2 = t.length() - 1; // 指向字符串 t 的末尾
            int skipS = 0; // 字符串 s 中需要跳过的退格符数量
            int skipT = 0; // 字符串 t 中需要跳过的退格符数量

            while (p1 >= 0 || p2 >= 0) { // 从后向前遍历字符串 s 和字符串 t
                while (p1 >= 0) {
                    if (s.charAt(p1) == '#') { // 如果当前字符是退格符 #
                        skipS++; // 需要跳过的退格符数量加 1
                        p1--; // 指针向前移动
                    } else if (skipS > 0) { // 如果需要跳过字符
                        skipS--; // 需要跳过的退格符数量减 1
                        p1--; // 指针向前移动
                    } else {
                        break; // 当前字符不是退格符且不需要跳过，跳出循环
                    }
                }

                while (p2 >= 0) {
                    if (t.charAt(p2) == '#') { // 如果当前字符是退格符 #
                        skipT++; // 需要跳过的退格符数量加 1
                        p2--; // 指针向前移动
                    } else if (skipT > 0) { // 如果需要跳过字符
                        skipT--; // 需要跳过的退格符数量减 1
                        p2--; // 指针向前移动
                    } else {
                        break; // 当前字符不是退格符且不需要跳过，跳出循环
                    }
                }

                if (p1 >= 0 && p2 >= 0 && s.charAt(p1) != t.charAt(p2)) {
                    return false; // 当前字符不相等，返回 false
                }
                //最后可能p1--然后小于0
                if ((p1 >= 0) != (p2 >= 0)) {
                    return false; // 一个字符串已经遍历完，另一个字符串还有字符剩余，返回 false
                }

                p1--; // 指针向前移动
                p2--; // 指针向前移动
            }

            return true; // 遍历完字符串 s 和字符串 t 后，返回 true
        }
    }