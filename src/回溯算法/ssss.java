package 回溯算法;

import java.util.Scanner;


public class ssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 读取一行输入
        String line = sc.nextLine();

        // 使用 Scanner 对象解析输入的字符串
        Scanner lineScanner = new Scanner(line);

        // 通过循环读取多个数值
        while (lineScanner.hasNextInt()) {
            int n = lineScanner.nextInt();
            // 在此处进行你的处理逻辑，例如打印每个数字
            System.out.println(n);
        }

        sc.close();
    }
}
