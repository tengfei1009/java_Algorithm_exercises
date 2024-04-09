package 入门五;

import java.util.Scanner;

public class 数字反转_升级版_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s[] = new String[2];
        if (str.indexOf('.') != -1) { // 识别小数
            s = str.split("\\.");
            turn(s[0]);
            System.out.print(".");
            turn(s[1]);
        } else if (str.indexOf('/') != -1) { // 识别分数
            s = str.split("/");
            turn(s[0]);
            System.out.print("/");
            turn(s[1]);
        } else if (str.indexOf('%') != -1) { // 识别百分数
            s = str.split("%");
            turn(s[0]);
            System.out.print("%");
        } else { // 识别整数
            turn(str);
        }
    }

    // 字符反倒
    public static void turn(String str) {
        boolean flag1 = false; // 标志前面多余的0
        boolean flag2 = false; // 标志后面多余的0
        String s = "";
        // 去除前面多余的0
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!flag1 && str.charAt(i) == '0') {
                continue;
            }
            flag1 = true;
            s += str.charAt(i); // 表示已去除前面0的字符串
        }
        // 去除后面多余的0
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!flag2 && s.charAt(i) == '0') {
                continue;
            }
            flag2 = true;
            System.out.printf("%s", s.charAt(i));
        }
        if (str == "" || s == "") {
            System.out.print("0");
            return;
        }
    }
}
