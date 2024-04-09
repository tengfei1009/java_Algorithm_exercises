package 力扣链表.简单;

import java.util.Scanner;

public class sdaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.hasNext()); // 打印初始状态下的返回值

        while (sc.hasNext()) {
            System.out.println("请输入");
            String input = sc.nextLine();
            System.out.println(input);
            System.out.println(sc.hasNext("222")); // 打印每次循环结束后的返回值
        }

// 关闭输入流
        sc.close();
    }
}
